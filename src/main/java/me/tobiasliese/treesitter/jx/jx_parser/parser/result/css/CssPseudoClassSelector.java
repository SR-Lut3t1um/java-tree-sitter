package me.tobiasliese.treesitter.jx.jx_parser.parser.result.css;

import java.util.Optional;

public record CssPseudoClassSelector(
    Optional<CssSelector> cssSelector,
    CssPseudoClassSelectorValue value
)
    implements CssSelector {
}
