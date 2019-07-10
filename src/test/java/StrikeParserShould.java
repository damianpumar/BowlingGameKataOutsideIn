import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeParserShould {
    @Test
    public void frame_is_null_when_current_frame_is_not_strike() {
        String[] rolls = new String[]{"45", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        StrikeParser strikeParser = new StrikeParser(rolls);

        Frame frame = strikeParser.evaluate(0);

        assertThat(frame).isNull();
    }

    @Test
    public void frame_is_not_null_when_current_frame_is_strike() {
        String[] rolls = new String[]{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        StrikeParser strikeParser = new StrikeParser(rolls);

        Frame frame = strikeParser.evaluate(0);

        assertThat(frame).isNotNull();
    }

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

    @Test
    public void score_is_13_when_strike_frame_is_compose_with_miss_and_3() {
        String[] rolls = new String[]{"X", "-3", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        StrikeParser strikeParser = new StrikeParser(rolls);

        Frame frame = strikeParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(13);
    }

    @Test
    public void score_is_15_when_strike_frame_is_compose_with_5_and_miss() {
        String[] rolls = new String[]{"X", "5-", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        StrikeParser strikeParser = new StrikeParser(rolls);

        Frame frame = strikeParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(15);
    }

    @Test
    public void score_is_17_when_strike_frame_is_compose_with_5_and_2() {
        String[] rolls = new String[]{"X", "52", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        StrikeParser strikeParser = new StrikeParser(rolls);

        Frame frame = strikeParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(17);
    }
}