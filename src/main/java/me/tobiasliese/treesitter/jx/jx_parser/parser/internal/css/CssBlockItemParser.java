package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssBlock;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssBlockItem;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;
import java.util.List;

@NullMarked
public class CssBlockItemParser {
    @Contract("_->new")
    public static CssBlock parse(Node node) {
        List<CssBlockItem> items = new ArrayList<>();
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "cssdeclaration" -> {
                    items.add(CssDeclarationParser.parse(child));
                }
                case "cssrule_set" ->
                    items.add(CssRuleSetParser.parse(child));
                default ->
                    throw new IllegalStateException("couldn't parse type: " + child.getType());
            }
        }
        return new CssBlock(items);
    }
}
