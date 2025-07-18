package me.tobiasliese.treesitter.jx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.treesitter.jtreesitter.Language;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LanguageTest {
    private static Language language;

    @BeforeAll
    public static void beforeAll() {
        language = new Language(TreeSitterJx.language());
    }

    @Test
    void getName() {
        assertEquals("jx", language.getName());
    }
}
