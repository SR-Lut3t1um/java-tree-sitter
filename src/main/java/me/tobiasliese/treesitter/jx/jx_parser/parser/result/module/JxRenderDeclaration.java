package me.tobiasliese.treesitter.jx.jx_parser.parser.result.module;

import me.tobiasliese.treesitter.jx.jx_parser.parser.result.jx_elements.JxExpression;

import java.util.SequencedMap;

public record JxRenderDeclaration(JxExpression jxExpression, SequencedMap<String, String> parameters) {
}
