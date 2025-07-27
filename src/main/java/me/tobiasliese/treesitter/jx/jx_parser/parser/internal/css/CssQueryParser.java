package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssQuery;

public class CssQueryParser {
    public static CssQuery parse(Node node) {
        Node child = node.getChildren().getFirst();
        switch (child.getType()) {
            case "cssfeature_query" -> {
                return CssFeatureQueryParser.parse(child);
            }
            default ->
                throw new IllegalStateException("Couldn't parse css query: " + child.getType());
        }
    }
}
