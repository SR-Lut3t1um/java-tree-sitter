package me.tobiasliese.treesitter.jx.jx_parser.parser;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.html.HtmlElementParser;
import me.tobiasliese.treesitter.jx.jx_parser.result.jx_elements.JxExpression;

public class JxExpressionParser {
    public static JxExpression parseJxExpression(Node node) {
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "jx_element" -> {

                }
                case "jx_fragment" -> {

                }
                case "html_element" -> {
                    HtmlElementParser.parseHtmlElement(child);
                }
            }
        }
        return null;
    }
}
