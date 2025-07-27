package me.tobiasliese.treesitter.jx.jx_parser.parser.result.module;

import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.JxCssDeclaration;

import java.util.Optional;

public record JxComponents(JxRenderDeclaration jxRenderDeclaration, Optional<JxCssDeclaration> jxCssDeclaration) {

}
