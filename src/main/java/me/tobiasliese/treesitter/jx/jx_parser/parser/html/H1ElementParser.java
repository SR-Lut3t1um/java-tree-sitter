package me.tobiasliese.treesitter.jx.jx_parser.parser.html;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.result.html.GlobalAttributes;
import me.tobiasliese.treesitter.jx.jx_parser.result.html.H1Element;
import me.tobiasliese.treesitter.jx.jx_parser.result.html.builder.GlobalAttributesBuilder;

public class H1ElementParser {
    public static H1Element parseH1Element(Node node) {
        for (Node child : node.getChildren()) {
            switch (child.getType()) {
                case "h1_attributes" -> {
                    parseH1Attributes(child);
                }
            }
        }
        return null;
    }

    private static void parseH1Attributes(Node node) {
        GlobalAttributesBuilder builder = new GlobalAttributesBuilder();
        for (var child : node.getChildren()) {
            System.out.println(child.getType());
            switch (child.getType()) {
                case "html_global_attribute" -> {
                    HtmlElementParser.parseGlobalAttribute(child, builder);
                }
            }
        }
    }
}
