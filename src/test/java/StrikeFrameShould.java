import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeFrameShould {
    @Test
    public void return_30_when_the_next_two_pins_are_strike_too() {
        StrikeFrame strikeFrame = new StrikeFrame();

        assertThat(strikeFrame.score()).isEqualTo(30);
    }
}