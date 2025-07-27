package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.jx_module;

import io.github.treesitter.jtreesitter.Node;

import me.tobiasliese.treesitter.jx.jx_parser.parser.result.module.JxComponents;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.module.JxModule;

public class JxModuleParser {
    public static JxModule parseJxModule(Node node) {
        String name = "";
        JxComponents jxComponents = null;
        for (var child : node.getChildren()) {
            switch (child.getType()) {
                case "identifier" -> {
                    name = child.getText();
                }
                case "{", "}" -> {
                }
                case "jx_components" -> {
                    jxComponents = JxComponentsParser.parse(child);
                }
                default -> {
                    throw new IllegalStateException("invalid type" + child.getType());
                }
            }
        }
        return new JxModule(name, jxComponents);
    }

}
