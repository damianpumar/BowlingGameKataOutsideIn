import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParsersShould {
    @Test
    public void create_parser_with_rolls_parsed_without_boundary_separator() {
        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        Parsers parsers = new Parsers();

        assertThat(parsers.build(rolls)).isNotNull();
    }
}