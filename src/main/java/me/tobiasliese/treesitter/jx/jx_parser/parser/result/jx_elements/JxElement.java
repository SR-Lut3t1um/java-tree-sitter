package me.tobiasliese.treesitter.jx.jx_parser.parser.result.jx_elements;

import java.util.List;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.jx_child.JxChild;

public abstract class JxElement extends JxExpression {
    private List<JxChild> children;
}
