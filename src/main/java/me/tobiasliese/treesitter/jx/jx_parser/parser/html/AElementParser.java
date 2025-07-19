package me.tobiasliese.treesitter.jx.jx_parser.parser.html;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.result.html.AElement;

public class AElementParser {
    public static AElement parseAElement(Node node) {
        if (!node.getType().equals("a")) throw new IllegalStateException("unsupported type");
        System.out.println();
        return null;
    }
}
