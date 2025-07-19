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

    public GlobalAttributesBuilder contenteditable(String contenteditable) {
        this.contenteditable = contenteditable;
        return this;
    }

    public String contenteditable() {
        return contenteditable;
    }

    public GlobalAttributesBuilder dir(String dir) {
        this.dir = dir;
        return this;
    }

    public String dir() {
        return dir;
    }

    public GlobalAttributesBuilder draggable(String draggable) {
        this.draggable = draggable;
        return this;
    }

    public String draggable() {
        return draggable;
    }

    public GlobalAttributesBuilder enterkeyhint(String enterkeyhint) {
        this.enterkeyhint = enterkeyhint;
        return this;
    }

    public String enterkeyhint() {
        return enterkeyhint;
    }

    public GlobalAttributesBuilder hidden(String hidden) {
        this.hidden = hidden;
        return this;
    }

    public String hidden() {
        return hidden;
    }

    public GlobalAttributesBuilder id(String id) {
        this.id = id;
        return this;
    }

    public String id() {
        return id;
    }

    public GlobalAttributesBuilder intert(String inert) {
        this.inert = inert;
        return this;
    }

    public String inert() {
        return inert;
    }

    public GlobalAttributesBuilder inputmode(String inputmode) {
        this.inputmode = inputmode;
        return this;
    }

    public String inputmode() {
        return inputmode;
    }

    public GlobalAttributesBuilder is(String is) {
        this.is = is;
        return this;
    }

    public String is() {
        return is;
    }

    public GlobalAttributesBuilder itemid(String itemid) {
        this.itemid = itemid;
        return this;
    }

    public String itemid() {
        return itemid;
    }

    public GlobalAttributesBuilder itemprop(String itemprop) {
        this.itemprop = itemprop;
        return this;
    }

    public String itemprop() {
        return itemprop;
    }

    public GlobalAttributesBuilder itemref(String itemref) {
        this.itemref = itemref;
        return this;
    }

    public String itemref() {
        return itemref;
    }

    public GlobalAttributesBuilder itemscope(String itemscope) {
        this.itemscope = itemscope;
        return this;
    }

    public String itemscope() {
        return itemscope;
    }

    public GlobalAttributesBuilder itemtype(String itemtype) {
        this.itemtype = itemtype;
        return this;
    }

    public String itemtype() {
        return itemtype;
    }

    public GlobalAttributesBuilder lang(String lang) {
        this.lang = lang;
        return this;
    }

    public String lang() {
        return lang;
    }

    public GlobalAttributesBuilder nonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public String nonce() {
        return nonce;
    }

    public GlobalAttributesBuilder popover(String popover) {
        this.popover = popover;
        return this;
    }

    public String popover() {
        return popover;
    }

    public GlobalAttributesBuilder spellcheck(String spellcheck) {
        this.spellcheck = spellcheck;
        return this;
    }

    public String spellcheck() {
        return spellcheck;
    }

    public GlobalAttributesBuilder slot(String slot) {
        this.slot = slot;
        return this;
    }

    public String slot() {
        return slot;
    }

    public GlobalAttributesBuilder style(String style) {
        this.style = style;
        return this;
    }

    public String style() {
        return style;
    }

    public GlobalAttributesBuilder tabindex(String tabindex) {
        this.tabindex = tabindex;
        return this;
    }

    public String tabindex() {
        return tabindex;
    }

    public GlobalAttributesBuilder title(String title) {
        this.title = title;
        return this;
    }

    public String title() {
        return title;
    }

    public GlobalAttributesBuilder translate(String translate) {
        this.translate = translate;
        return this;
    }

    public String translate() {
        return translate;
    }

    public GlobalAttributesBuilder writingsuggestion(String writingsuggestion) {
        this.writingsuggestion = writingsuggestion;
        return this;
    }

    public String writingsuggestion() {
        return writingsuggestion;
    }

    public GlobalAttributes build() {
        return new GlobalAttributes(this);
    }
}
