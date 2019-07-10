import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingFeature {
    private Bowling bowling;

    @Before
    public void setup() {
        this.bowling = new Bowling(new LineParser(new ParserBuilder()));
    }

    @Test
    public void scores_is_300_when_all_pin_is_strike() {
        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        assertThat(this.bowling.score(rolls)).isEqualTo(300);
    }

    @Test
    public void scores_is_90_when_all_pin_is_strike() {
        String rolls = "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||";

        assertThat(this.bowling.score(rolls)).isEqualTo(90);
    }
}
