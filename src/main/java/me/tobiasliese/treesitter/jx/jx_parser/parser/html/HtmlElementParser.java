package me.tobiasliese.treesitter.jx.jx_parser.parser.html;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.result.html.GlobalAttributes;
import me.tobiasliese.treesitter.jx.jx_parser.result.html.HtmlElement;

public class HtmlElementParser {

    static void parseGlobalAttribute(Node node, GlobalAttributes globalAttributes) {
        String type = node.getChild(0).orElseThrow().getType();
        String value = node.getChild(1).orElseThrow().getText();
        switch (type) {
            case "id" -> {
                globalAttributes.setId(value);
            }
            case "class" -> {
                globalAttributes.setCls(value);
            }
        }
    }

    public static HtmlElement parseHtmlElement(Node node) {
        if (!node.getType().equals("html_element"))
            throw new IllegalStateException("unsupported element");
        if (node.getChildren().size() != 1)
            throw new IllegalStateException();
        var child = node.getChildren().getFirst();
        switch (child.getType()) {
            case "a" -> {
                return AElementParser.parseAElement(child);
            }
            case "abbr" -> {

            }
            case "address" -> {

            }
            case "area" -> {

            }
            case "article" -> {

            }
            case "aside" -> {

            }
            case "audio" -> {

            }
            case "b" -> {

            }
            case "base" -> {

            }
            case "bdi" -> {

            }
            case "bdo" -> {

            }
            case "blockquote" -> {

            }
            case "body" -> {

            }
            case "br" -> {

            }
            case "button" -> {

            }
            case "canvas" -> {

            }
            case "caption" -> {

            }
            case "cite" -> {

            }
            case "h1" -> {
                return H1ElementParser.parseH1Element(child);
            }
        }
        return null;
    }
}
