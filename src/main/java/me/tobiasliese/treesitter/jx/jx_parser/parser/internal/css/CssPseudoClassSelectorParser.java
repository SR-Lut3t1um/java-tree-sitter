package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssPseudoClassSelector;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssPseudoClassSelectorValue;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssSelector;
import org.jspecify.annotations.NullMarked;

import java.util.Optional;

@NullMarked
public class CssPseudoClassSelectorParser {
    public static CssPseudoClassSelector parse(Node node) {
        Optional<CssSelector> selector = Optional.empty();
        CssPseudoClassSelectorValue value = null;
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "css_selector" ->
                    selector = Optional.of(CssSelectorParser.parse(child));
                case "cssclass_name" ->
                    value = CssClassNameParser.parse(child);
            }
        }
        return new CssPseudoClassSelector(selector, value);
    }
}
