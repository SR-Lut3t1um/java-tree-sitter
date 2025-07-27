package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssTopLevelItem;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.JxCssDeclaration;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.List;

public class JxCssDeclarationParser {
    public static @NonNull JxCssDeclaration parse(@NonNull Node node) {
        if (! node.getType().equals("jx_css_declaration"))
            throw new IllegalStateException("Unsupported Node type: " + node.getType());
        List<CssTopLevelItem> cssTopLevelItems = new ArrayList<>();
        for (Node child: node.getChildren()) {
            if (child.getType().equals("css_top_level_item")) {
                cssTopLevelItems.add(CssTopLevelParser.parse(child));
            }
        }
        return new JxCssDeclaration(cssTopLevelItems);
    }
}
