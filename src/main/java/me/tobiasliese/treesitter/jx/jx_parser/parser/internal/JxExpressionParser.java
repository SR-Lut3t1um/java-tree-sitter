package me.tobiasliese.treesitter.jx.jx_parser.parser.internal;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.internal.html.HtmlElementParser;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.jx_elements.JxExpression;

public class JxExpressionParser {
    public static JxExpression parse(Node node) {
        Node child = node.getChildren().getFirst();
        switch (child.getType()) {
            case "jx_element" -> {

            }
            case "jx_fragment" -> {

            }
            case "html_element" -> {
                return HtmlElementParser.parseHtmlElement(child);
            }
            default ->
                throw new IllegalStateException("unsupported element");
        }

        return null;
    }
}
