package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.jx_module;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.internal.JxExpressionParser;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.jx_elements.JxExpression;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.module.JxRenderDeclaration;
import org.jspecify.annotations.NonNull;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class JxRenderDeclarationParser {
    public static @NonNull JxRenderDeclaration parse(@NonNull Node node) {
        if (! node.getType().equals("jx_render_declaration"))
            throw new IllegalStateException("invalid node type: " + node.getType());
        JxExpression jxExpression = null;
        SequencedMap<String, String> parameters = null;
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "jx_expression" ->
                    jxExpression = JxExpressionParser.parse(child);
                case "formal_parameters" ->
                    parameters = parseParameters(child);
                case "render", "{", "}" -> {

                }
                default ->
                    throw new IllegalStateException("couldn't parse type: " + child.getType());
            }
        }
        return new JxRenderDeclaration(jxExpression, parameters);
    }

    private static @NonNull SequencedMap<String, String> parseParameters(@NonNull Node node) {
        SequencedMap<String, String> result = new LinkedHashMap<>();
        for (var child : node.getChildren()) {
            if (child.getType().equals("formal_parameter")) {
                var entry = parseParameter(child);
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    private static Map.@NonNull Entry<String, String> parseParameter(Node node) {
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
