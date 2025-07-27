package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssBlock;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssMediaStatement;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssQuery;
import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;
import java.util.List;

@NullMarked
public class CssMediaStatementParser {
    public static CssMediaStatement parse(Node node) {
        List<CssQuery> queries = new ArrayList<>();
        CssBlock block = null;
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "@media" -> {}
                case "css_query" ->
                    queries.add(CssQueryParser.parse(child));
                case "cssblock" ->
                    block = CssBlockParser.parse(child);
                default ->
                    throw new IllegalStateException("Coudln't parse CssMediaStatement: " + child.getType());
            }
        }
        return new CssMediaStatement(queries, block);
    }
}
