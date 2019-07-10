import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpareParserShould {
    @Test
    public void frame_is_null_when_current_frame_is_not_spare() {
        String[] rolls = new String[]{"45", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        SpareParser spareParser = new SpareParser(rolls);

        Frame frame = spareParser.evaluate(0);

        assertThat(frame).isNull();
    }

    @Test
    public void frame_is_not_null_when_current_frame_is_spare() {
        String[] rolls = new String[]{"4/", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        SpareParser spareParser = new SpareParser(rolls);

        Frame frame = spareParser.evaluate(0);

        assertThat(frame).isNotNull();
    }

    @Test
    public void return_12_when_the_next_pin_is_2() {
        String[] rolls = new String[]{"4/", "2-", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        SpareParser spareParser = new SpareParser(rolls);

        Frame frame = spareParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(12);
    }

    @Test
    public void return_10_when_the_next_pin_is_missed() {
        String[] rolls = new String[]{"4/", "-8", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        SpareParser spareParser = new SpareParser(rolls);

        Frame frame = spareParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(10);
    }

    @Test
    public void return_20_when_the_next_pin_is_strike() {
        String[] rolls = new String[]{"4/", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        SpareParser spareParser = new SpareParser(rolls);

        Frame frame = spareParser.evaluate(0);

        assertThat(frame.score()).isEqualTo(20);
    }
}