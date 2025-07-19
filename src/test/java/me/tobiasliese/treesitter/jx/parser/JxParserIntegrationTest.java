package me.tobiasliese.treesitter.jx.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import me.tobiasliese.treesitter.jx.jx_parser.JxParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JxParserIntegrationTest {
    @Test
    public void integrationTest1() {
        try (var stream = this.getClass().getClassLoader().getResourceAsStream("testcases/1/example.jx")) {
            Assertions.assertNotNull(stream);
            String content =
                    new BufferedReader(new InputStreamReader(stream)).lines().collect(Collectors.joining());
            var result = JxParser.parseFile(content).orElseThrow();
            assertEquals("example.example", result.getPackage());
        } catch (IOException e) {
            throw new RuntimeException("File not found");
        }
    }
}
