import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MissedParserShould {
    @Test
    public void frame_is_null_when_current_frame_is_not_miss() {
        String[] rolls = new String[]{"81", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        MissedParser missedParser = new MissedParser(rolls);

        Frame frame = missedParser.evaluate(0);

        assertThat(frame).isNull();
    }

    @Test
    public void frame_is_not_null_when_current_frame_is_miss_symbol_left() {
        String[] rolls = new String[]{"-8", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        MissedParser missedParser = new MissedParser(rolls);

        Frame frame = missedParser.evaluate(0);

        assertThat(frame).isNotNull();
    }

    @Test
    public void frame_is_not_null_when_current_frame_is_miss_symbol_right() {
        String[] rolls = new String[]{"8-", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        MissedParser missedParser = new MissedParser(rolls);

        Frame frame = missedParser.evaluate(0);

        assertThat(frame).isNotNull();
    }

    @Test
    public void score_is_9_when_missed_frame_is_right() {
        String[] rolls = new String[]{"9-", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        MissedParser missedParser = new MissedParser(rolls);

        Frame frame = missedParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(9);
    }

    @Test
    public void score_is_7_when_missed_frame_is_right() {
        String[] rolls = new String[]{"-7", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        MissedParser missedParser = new MissedParser(rolls);

        Frame frame = missedParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(7);
    }
}