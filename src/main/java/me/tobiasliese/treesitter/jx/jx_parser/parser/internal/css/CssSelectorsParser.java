package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssSelector;

import java.util.ArrayList;
import java.util.List;

public class CssSelectorsParser {
    public static List<CssSelector> parse(Node node) {
        if (! node.getType().equals("cssselectors"))
            throw new IllegalStateException("Invalid node type: " + node.getType());
        List<CssSelector> selectors = new ArrayList<>();
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "css_selector" -> {
                    selectors.add(CssSelectorParser.parse(child));
                }
            }
        }

        return selectors;
    }
}
