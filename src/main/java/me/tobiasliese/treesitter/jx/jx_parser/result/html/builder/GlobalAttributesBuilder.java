package me.tobiasliese.treesitter.jx.jx_parser.result.html.builder;

import me.tobiasliese.treesitter.jx.jx_parser.result.html.GlobalAttributes;

public class GlobalAttributesBuilder {
    private String accesskey;
    private String autocapitalize;
    private String autocorrect;
    private String autofocus;
    private String cls;
    private String contenteditable;
    private String dir;
    private String draggable;
    private String enterkeyhint;
    private String hidden;
    private String id;
    private String inert;
    private String inputmode;
    private String is;
    private String itemid;
    private String itemprop;
    private String itemref;
    private String itemscope;
    private String itemtype;
    private String lang;
    private String nonce;
    private String popover;
    private String spellcheck;
    private String slot;
    private String style;
    private String tabindex;
    private String title;
    private String translate;
    private String writingsuggestion;

    public GlobalAttributesBuilder accesskey(String accesskey) {
        this.accesskey = accesskey;
        return this;
    }

    public String accesskey() {
        return accesskey;
    }

    public GlobalAttributesBuilder autocapitalize(String autocapitalize) {
        this.autocapitalize = autocapitalize;
        return this;
    }

    public String autocapitalize() {
        return autocapitalize;
    }

    public GlobalAttributesBuilder autocorrect(String autocorrect) {
        this.autocorrect = autocorrect;
        return this;
    }

    public String autocorrect() {
        return autocorrect;
    }

    public GlobalAttributesBuilder autofocus(String autofocus) {
        this.autofocus = autofocus;
        return this;
    }

    public String autofocus() {
        return autofocus;
    }

    public GlobalAttributesBuilder cls(String cls) {
        this.cls = cls;
        return this;
    }

    public String cls() {
        return cls;
    }

    public GlobalAttributesBuilder contenteditable(String value) {
        this.contenteditable = value;
        return this;
    }

    public String contenteditable() {
        return contenteditable;
    }

    public GlobalAttributes build() {
        return new GlobalAttributes(this);
    }
}
