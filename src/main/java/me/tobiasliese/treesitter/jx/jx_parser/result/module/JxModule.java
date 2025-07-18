package me.tobiasliese.treesitter.jx.jx_parser.result.module;

import java.util.SequencedMap;

import me.tobiasliese.treesitter.jx.jx_parser.result.jx_elements.JxExpression;

public class JxModule {
    String name;
    SequencedMap<String, String> parameters;
    JxExpression jxExpression;

    public JxModule(String name, SequencedMap<String, String> parameters, JxExpression jxExpression) {
        this.name = name;
        this.parameters = parameters;
        this.jxExpression = jxExpression;
    }

    public String getName() {
        return name;
    }

    public SequencedMap<String, String> getParameters() {
        return getParameters();
    }

    public JxExpression getJxExpression() {
        return jxExpression;
    }
}
