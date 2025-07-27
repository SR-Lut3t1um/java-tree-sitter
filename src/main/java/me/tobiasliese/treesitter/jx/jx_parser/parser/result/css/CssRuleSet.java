package me.tobiasliese.treesitter.jx.jx_parser.parser.result.css;

import org.jspecify.annotations.NullMarked;

import java.util.List;

@NullMarked
public record CssRuleSet(List<CssSelector> cssSelectors, CssBlock cssBlock) implements CssTopLevelItem, CssBlockItem {
}
