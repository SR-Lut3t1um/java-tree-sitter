package me.tobiasliese.treesitter.jx.jx_parser.parser.internal;

import io.github.treesitter.jtreesitter.Node;
import io.github.treesitter.jtreesitter.Tree;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import me.tobiasliese.treesitter.jx.jx_parser.parser.JxFile;
import me.tobiasliese.treesitter.jx.jx_parser.parser.internal.jx_module.JxModuleParser;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.module.JxModule;

public class JxFileParser {
    public static Optional<JxFile> parseJxFile(Tree tree) {
        Node node = tree.getRootNode();
        String pkg = "";
        List<String> imports = new ArrayList<>();
        JxModule jxModule = null;

        for (Node child : node.getChildren()) {
            switch (child.getType()) {
                case "package_declaration" -> {
                    pkg = parsePackageDeclaration(child);
                }
                case "import_declarations" -> {
                    imports = parseImportsDeclaration(child);
                }
                case "jx_module_declaration" -> {
                    jxModule = JxModuleParser.parseJxModule(child);
                }
            }
        }
        if (jxModule == null || pkg.isEmpty()) return Optional.empty();
        return Optional.of(new JxFile(pkg, imports, jxModule, tree));
    }

    private static String parsePackageDeclaration(Node node) {
        StringBuilder builder = new StringBuilder();
        for (var child : node.getChildren()) {
            if (child.getType().equals("scoped_identifier")) {
                parseScopedIdentifier(child, builder);
            }
        }
        return builder.toString();
    }

    private static List<String> parseImportsDeclaration(Node node) {
        return node.getChildren().stream()
                .map(JxFileParser::parseImportDeclaration)
                .toList();
    }

    private static String parseImportDeclaration(Node node) {
        StringBuilder builder = new StringBuilder();
        for (var child : node.getChildren()) {
            if (child.getType().equals("scoped_identifier")) {
                parseScopedIdentifier(child, builder);
            }
        }
        return builder.toString();
    }

    private static void parseScopedIdentifier(Node node, StringBuilder builder) {
        for (var child : node.getChildren()) {
            switch (child.getType()) {
                case "scoped_identifier" -> {
                    parseScopedIdentifier(child, builder);
                }
                case "." -> {
                    builder.append(".");
                }
                case "identifier" -> {
                    builder.append(child.getText());
                }
            }
        }
    }
}
