package me.tobiasliese.treesitter.jx.jx_parser.parser.internal.jx_module;

import io.github.treesitter.jtreesitter.Node;
import me.tobiasliese.treesitter.jx.jx_parser.parser.internal.css.JxCssDeclarationParser;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.module.JxComponents;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.css.JxCssDeclaration;
import me.tobiasliese.treesitter.jx.jx_parser.parser.result.module.JxRenderDeclaration;

import java.util.Optional;

public class JxComponentsParser {
    public static JxComponents parse(Node node) {
        if (! node.getType().equals("jx_components"))
            throw new IllegalStateException("Unsupported element type" + node.getType());
        JxRenderDeclaration jxRenderDeclaration = null;
        Optional<JxCssDeclaration> jxCssDeclaration = Optional.empty();
        for (Node child: node.getChildren()) {
            switch (child.getType()) {
                case "jx_render_declaration" ->
                    jxRenderDeclaration = JxRenderDeclarationParser.parse(child);
                case "jx_css_declaration" ->
                    jxCssDeclaration = Optional.of(JxCssDeclarationParser.parse(child));
            }
        }
        if (jxRenderDeclaration == null) {
            throw new IllegalStateException("No JxRenderDeclaration provided");
        }
        return new JxComponents(jxRenderDeclaration, jxCssDeclaration);
    }
}
