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
    public void frame_is_not_null_when_current_frame_is_miss_simbol_left() {
        String[] rolls = new String[]{"-8", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        MissedParser missedParser = new MissedParser(rolls);

        Frame frame = missedParser.evaluate(0);

        assertThat(frame).isNotNull();
    }

    @Test
    public void frame_is_not_null_when_current_frame_is_miss_simbol_right() {
        String[] rolls = new String[]{"8-", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        MissedParser missedParser = new MissedParser(rolls);

        Frame frame = missedParser.evaluate(0);

        assertThat(frame).isNotNull();
    }
}