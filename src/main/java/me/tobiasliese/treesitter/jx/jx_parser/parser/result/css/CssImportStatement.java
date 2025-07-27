package me.tobiasliese.treesitter.jx.jx_parser.parser.result.css;

import java.util.List;

public record CssImportStatement(CssValue value, List<CssQuery> queries) implements CssTopLevelItem {
}
