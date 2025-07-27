package me.tobiasliese.treesitter.jx.jx_parser.parser.result.css;

import java.util.List;

public record CssMediaStatement(List<CssQuery> queries, CssBlock cssBlock) implements CssTopLevelItem {
}
