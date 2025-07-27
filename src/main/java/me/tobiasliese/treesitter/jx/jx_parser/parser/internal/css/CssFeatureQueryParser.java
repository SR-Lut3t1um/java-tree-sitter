package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssFeatureQuery;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssValue;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CssFeatureQueryParser {
    public static CssFeatureQuery parse(Node node) {
        String name = null;
        CssValue value = null;
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "(", ":", ")" -> {}
                case "feature_name" ->
                    name = child.getText();
                case "css_value" ->
                    value = CssValueParser.parse(child);
                default ->
                    throw new IllegalStateException("couldn't parse type: " + child.getType());
            }
        }
        return new CssFeatureQuery(name, value);
    }
}
