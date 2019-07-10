import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserShould {
    @Test
    public void create_instance_of_StrikeFrame_when_rolls_contain_Strike() {
        String[] rolls = new String[]{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        Parser parser = new Parser(rolls);

        Frame frame = parser.evaluate(0);

        assertThat(frame).isInstanceOf(StrikeFrame.class);
    }
}