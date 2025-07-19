package me.tobiasliese.treesitter.jx.jx_parser.parser;

import io.github.treesitter.jtreesitter.Node;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import me.tobiasliese.treesitter.jx.jx_parser.result.jx_elements.JxExpression;
import me.tobiasliese.treesitter.jx.jx_parser.result.module.JxModule;

public class JxModuleParser {
    public static JxModule parseJxModule(Node node) {
        String name = "";
        SequencedMap<String, String> parameters = new LinkedHashMap<>();
        JxExpression jxExpression = null;
        for (var child : node.getChildren()) {
            switch (child.getType()) {
                case "jx_module_name" -> {
                    name = parseModuleName(child);
                }
                case "formal_parameters" -> {
                    parameters = parseParameters(child);
                }
                case "jx_expression" -> {
                    jxExpression = JxExpressionParser.parseJxExpression(child);
                }
            }
        }
        return new JxModule(name, parameters, jxExpression);
    }

    private static String parseModuleName(Node node) {
        if (node.getChildren().size() != 1) return "";
        return node.getChildren().getFirst().getText();
    }

    private static SequencedMap<String, String> parseParameters(Node node) {
        SequencedMap<String, String> result = new LinkedHashMap<>();
        for (var child : node.getChildren()) {
            if (child.getType().equals("formal_parameter")) {
                var entry = parseParameter(child);
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    private static Map.Entry<String, String> parseParameter(Node node) {
        String name = "";
        String type = "";
        for (var child : node.getChildren()) {
            if (child.getType().equals("identifier")) {
                name = child.getText();
            } else {
                type = child.getText();
            }
        }
        return new AbstractMap.SimpleEntry<>(name, type);
    }
}
