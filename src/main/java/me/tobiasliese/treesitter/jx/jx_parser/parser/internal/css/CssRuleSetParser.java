package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssBlock;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssRuleSet;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssSelector;
import org.jspecify.annotations.NullMarked;

import java.util.List;

@NullMarked
public class CssRuleSetParser {
    public static CssRuleSet parse(Node node) {
        if (! node.getType().equals("cssrule_set"))
            throw new IllegalStateException("Invalid element type: " + node.getType());
        List<CssSelector> cssSelectors = null;
        CssBlock cssBlock = null;
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "cssselectors" ->
                    cssSelectors = CssSelectorsParser.parse(child);
                case "cssblock" ->
                    cssBlock = CssBlockParser.parse(child);
            }
        }
        return new CssRuleSet(cssSelectors, cssBlock);
    }
}
