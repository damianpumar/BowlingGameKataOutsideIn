import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberParserShould {
    @Test
    public void frame_is_null_when_current_frame_is_not_a_number() {
        String[] rolls = new String[]{"8/", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        NumberParser numberParser = new NumberParser(rolls);

        Frame frame = numberParser.evaluate(0);

        assertThat(frame).isNull();
    }

    @Test
    public void frame_is_not_null_when_current_frame_is_a_number() {
        String[] rolls = new String[]{"81", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        NumberParser numberParser = new NumberParser(rolls);

        Frame frame = numberParser.evaluate(0);

        assertThat(frame).isNotNull();
    }

    @Test
    public void score_is_9_when_frame_has_8_and_1() {
        String[] rolls = new String[]{"81", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        NumberParser numberParser = new NumberParser(rolls);

        Frame frame = numberParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(9);
    }

    @Test
    public void score_is_4_when_frame_has_3_and_1() {
        String[] rolls = new String[]{"31", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        NumberParser numberParser = new NumberParser(rolls);

        Frame frame = numberParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(4);
    }
}