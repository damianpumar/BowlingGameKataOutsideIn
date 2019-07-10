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
}