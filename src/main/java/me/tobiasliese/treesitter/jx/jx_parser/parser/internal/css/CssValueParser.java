package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssPlainValue;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssValue;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CssValueParser {
    public static CssValue parse(Node node) {
        Node child = node.getChildren().getFirst();
        switch (child.getType()) {
            case "cssplain_value" -> {
                return new CssPlainValue(child.getText());
            }
            default -> throw new IllegalStateException("Couldn't parse CssValue");
        }
    }
}
