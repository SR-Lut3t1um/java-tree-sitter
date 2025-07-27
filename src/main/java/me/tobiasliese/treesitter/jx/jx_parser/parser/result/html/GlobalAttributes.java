package me.tobiasliese.treesitter.jx.jx_parser.parser.result.html;

import me.tobiasliese.treesitter.jx.jx_parser.parser.result.html.builder.GlobalAttributesBuilder;

public class GlobalAttributes {
    private final String accesskey;
    private final String autocapitalize;
    private final String autocorrect;
    private final String autofocus;
    private final String cls;
    private final String contenteditable;
    private final String dir;
    private final String draggable;
    private final String enterkeyhint;
    private final String hidden;
    private final String id;
    private final String inert;
    private final String inputmode;
    private final String is;
    private final String itemid;
    private final String itemprop;
    private final String itemref;
    private final String itemscope;
    private final String itemtype;
    private final String lang;
    private final String nonce;
    private final String popover;
    private final String spellcheck;
    private final String slot;
    private final String style;
    private final String tabindex;
    private final String title;
    private final String translate;
    private final String writingsuggestion;

    public GlobalAttributes(GlobalAttributesBuilder builder) {
        this.accesskey = builder.accesskey();
        this.autocapitalize = builder.autocapitalize();
        this.autocorrect = builder.autocorrect();
        this.autofocus = builder.autofocus();
        this.cls = builder.cls();
        this.contenteditable = builder.contenteditable();
        this.dir = builder.dir();
        this.draggable = builder.draggable();
        this.enterkeyhint = builder.enterkeyhint();
        this.hidden = builder.hidden();
        this.id = builder.id();
        this.inert = builder.inert();
        this.inputmode = builder.inputmode();
        this.is = builder.is();
        this.itemid = builder.itemid();
        this.itemprop = builder.itemprop();
        this.itemref = builder.itemref();
        this.itemscope = builder.itemscope();
        this.itemtype = builder.itemtype();
        this.lang = builder.lang();
        this.nonce = builder.nonce();
        this.popover = builder.popover();
        this.spellcheck = builder.spellcheck();
        this.slot = builder.slot();
        this.style = builder.style();
        this.tabindex = builder.tabindex();
        this.title = builder.title();
        this.translate = builder.translate();
        this.writingsuggestion = builder.writingsuggestion();
    }
}
