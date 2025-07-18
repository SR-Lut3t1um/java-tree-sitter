package me.tobiasliese.treesitter.jx.jx_parser.result;

import io.github.treesitter.jtreesitter.Tree;
import java.util.List;
import me.tobiasliese.treesitter.jx.jx_parser.result.module.JxModule;

/**
 * A repesentation of a parsed jx file
 */
public class JxFile {
    private final String pck;
    private final List<String> imports;
    private final JxModule jxModule;
    private final Tree tree;

    public JxFile(String pck, List<String> imports, JxModule jxModule, Tree tree) {
        this.pck = pck;
        this.imports = imports;
        this.jxModule = jxModule;
        this.tree = tree;
    }

    public String getPackage() {
        return pck;
    }

    public List<String> getImports() {
        return List.copyOf(imports);
    }

    public JxModule getJxModule() {
        return jxModule;
    }

    public Tree getTree() {
        return tree;
    }
}
