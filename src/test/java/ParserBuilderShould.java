import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserBuilderShould {
    @Test
    public void create_parser_with_rolls_parsed_without_boundary_separator() {
        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        ParserBuilder parserBuilder = new ParserBuilder();

        assertThat(parserBuilder.build(rolls)).isNotNull();
    }
}