package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssTagName;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CssTagNameParser {
    public static CssTagName parse(Node node) {
        return new CssTagName(node.getText());
    }
}
