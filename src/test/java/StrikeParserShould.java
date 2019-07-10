import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeParserShould {
    @Test
    public void score_is_30_when_strike_frame_is_compose_with_two_strikes() {
        String[] rolls = new String[]{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        StrikeParser strikeParser = new StrikeParser(rolls);

        Frame frame = strikeParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(30);
    }

    @Test
    public void score_is_20_when_strike_frame_is_compose_with_miss_and_spare() {
        String[] rolls = new String[]{"X", "-/", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        StrikeParser strikeParser = new StrikeParser(rolls);

        Frame frame = strikeParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(20);
    }
}