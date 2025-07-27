package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssArgument;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.CssClassValue;

import java.util.ArrayList;
import java.util.List;

public class CssClassNameParser {
    public static CssClassValue parse(Node node) {
        String name = null;
        List<CssArgument> arguments = new ArrayList<>();
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "cssidentifier" ->
                    name = child.getText();
            }
        }
        return new CssClassValue(name, arguments);
    }
}
