module jtreesitter {
    requires org.jspecify;
    uses io.github.treesitter.jtreesitter.NativeLibraryLookup;
    exports me.tobiasliese.treesitter.jx.jx_parser.result.module;
    exports me.tobiasliese.treesitter.jx.jx_parser.result.html;
    exports me.tobiasliese.treesitter.jx.jx_parser.result.html.builder;
}
