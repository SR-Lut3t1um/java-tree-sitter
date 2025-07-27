package me.tobiasliese.treesitter.jx.jx_parser.parser.result.css;

import java.util.List;

public record CssClassValue(String name, List<CssArgument> cssArguments) implements CssPseudoClassSelectorValue {
}
