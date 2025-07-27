package me.tobiasliese.treesitter.jx.jx_parser.parser;

import io.github.treesitter.jtreesitter.Language;
import io.github.treesitter.jtreesitter.Parser;
import java.util.Optional;
import me.tobiasliese.treesitter.jx.TreeSitterJx;
import me.tobiasliese.treesitter.jx.jx_parser.parser.internal.JxFileParser;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class JxParser {
    public static Optional<JxFile> parseFile(String content) {
        Language language = new Language(TreeSitterJx.language());
        try (var parser = new Parser(language)) {
            try (var tree = parser.parse(content).orElseThrow(IllegalStateException::new)) {
                return JxFileParser.parseJxFile(tree);
            } catch (IllegalStateException reason) {
                System.err.println(reason.getMessage());
                return Optional.empty();
            }
        }
    }

    public static Optional<JxFile> parseFile(String content, JxFile old) {
        Language language = new Language(TreeSitterJx.language());
        try (var parser = new Parser(language)) {
            try (var tree = parser.parse(content, old.getTree()).orElseThrow(IllegalStateException::new)) {
                return JxFileParser.parseJxFile(tree);
            } catch (IllegalStateException reason) {
                System.err.println(reason.getMessage());
                return Optional.empty();
            }
        }
    }
}
