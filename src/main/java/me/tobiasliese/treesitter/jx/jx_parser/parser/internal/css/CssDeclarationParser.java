package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssDeclaration;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssValue;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CssDeclarationParser {
    public static CssDeclaration parse(Node node) {
        String name = null;
        CssValue value = null;
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "css_value" ->
                    value = CssValueParser.parse(child);
                case "property_name" ->
                    name = child.getText();
            }
        }
        return new CssDeclaration(name, value);
    }
}
