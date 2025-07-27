module jtreesitter {
    requires org.jspecify;
    requires org.jetbrains.annotations;
    uses io.github.treesitter.jtreesitter.NativeLibraryLookup;
    exports me.tobiasliese.treesitter.jx.jx_parser.parser.result.module;
    exports me.tobiasliese.treesitter.jx.jx_parser.parser.result.html;
    exports me.tobiasliese.treesitter.jx.jx_parser.parser.result.html.builder;
    exports me.tobiasliese.treesitter.jx.jx_parser.parser.result.css;
}
