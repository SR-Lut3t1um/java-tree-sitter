package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.html;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.html.HtmlElement;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.html.builder.GlobalAttributesBuilder;

public class HtmlElementParser {

    static void parseGlobalAttribute(Node node, GlobalAttributesBuilder builder) {
        String type = node.getChild(0).orElseThrow().getType();
        String value = node.getChild(1).orElseThrow().getText();
        switch (type) {
            case "accesskey" ->
                builder.accesskey(value);
            case "autocapitalize" ->
                builder.autocapitalize(value);
            case "autocorrect" ->
                builder.autocorrect(value);
            case "autofocus" ->
                builder.autofocus(value);
//            case "class" ->
//                builder.cls(value);
//            case "id" ->
//                globalAttributes.setId(value);
//            case "class" ->
//                globalAttributes.setCls(value);
        }
    }

    public static HtmlElement parseHtmlElement(Node node) {
        if (!node.getType().equals("html_element")) throw new IllegalStateException("unsupported element");
        if (node.getChildren().size() != 1) throw new IllegalStateException();
        var child = node.getChildren().getFirst();
        switch (child.getType()) {
            case "abbr" -> {}
            case "address" -> {}
            case "area" -> {}
            case "article" -> {}
            case "aside" -> {}
            case "audio" -> {}
            case "b" -> {}
            case "base" -> {}
            case "bdi" -> {}
            case "bdo" -> {}
            case "blockquote" -> {}
            case "body" -> {}
            case "br" -> {}
            case "button" -> {}
            case "canvas" -> {}
            case "caption" -> {}
            case "cite" -> {}
            case "h1" -> {
            }
        }
        return null;
    }
}
