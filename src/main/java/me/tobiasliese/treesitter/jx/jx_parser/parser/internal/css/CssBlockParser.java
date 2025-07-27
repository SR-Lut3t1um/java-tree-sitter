package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssBlock;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssBlockItem;
import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;
import java.util.List;

@NullMarked
public class CssBlockParser {
    public static CssBlock parse(Node node) {
        List<CssBlockItem> cssBlockItems = new ArrayList<>();
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "{", "}" -> {}
                case "css_block_item" -> {
                    cssBlockItems.add(CssBlockItemParser.parse(child));
                }
            }
        }
        if (cssBlockItems.isEmpty())
            throw new IllegalStateException("couldn't parse cssBlockItems");
        return new CssBlock(cssBlockItems);
    }
}
