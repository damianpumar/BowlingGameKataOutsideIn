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
}