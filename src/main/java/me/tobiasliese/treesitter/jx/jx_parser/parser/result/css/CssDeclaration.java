package me.tobiasliese.treesitter.jx.jx_parser.parser.result.css;

public record CssDeclaration(String propertyName, CssValue cssValue) implements CssBlockItem, CssTopLevelItem {
}
