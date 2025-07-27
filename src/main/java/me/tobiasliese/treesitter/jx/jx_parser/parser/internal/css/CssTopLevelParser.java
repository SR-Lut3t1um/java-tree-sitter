package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssTopLevelItem;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CssTopLevelParser {
    public static CssTopLevelItem parse(Node node) {
        Node child = node.getChild(0).orElseThrow(() -> new IllegalStateException("CssTopLevelItem has no child"));
        switch (child.getType()) {
            case "cssdeclaration" -> {
                return CssDeclarationParser.parse(child);
            }
            case "cssrule_set" -> {
                return CssRuleSetParser.parse(child);
            }
            case "cssimport_statement" -> {
                return CssImportStatementParser.parse(child);
            }
            case "cssmedia_statement" -> {
                return CssMediaStatementParser.parse(child);
            }
            case "csscharset_statement" -> {
                return CssCharsetStatementParser.parse(child);
            }
            case "cssnamespace_statement" -> {
                return CssNamespaceStatementParser.parse(child);
            }
            case "csskeyframes_statement" -> {
                return CssKeyFramesStatementParser.parse(child);
            }
            case "csssupports_statement" -> {
                return CssSupportsStatementParser.parse(child);
            }
            case "cssat_rule" -> {
                return CssAtRuleParser.parse(child);
            }
            default ->
                throw new IllegalStateException("Invalid CssTopLevelItem Type: " + child.getType());
        }
    }
}
