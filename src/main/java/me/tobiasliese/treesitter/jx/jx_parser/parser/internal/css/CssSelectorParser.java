package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssSelector;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CssSelectorParser {
    public static CssSelector parse(Node node) {
        Node child = node.getChildren().getFirst();
        switch (child.getType()) {
            case "csspseudo_class_selector" -> {
                return CssPseudoClassSelectorParser.parse(child);
            }
            case "tag_name" -> {
                return CssTagNameParser.parse(child);
            }
            default ->
                throw new IllegalStateException("invalid CssSelector type: " + child.getType());
        }
    }
}
