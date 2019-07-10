import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeFrameShould {
    @Test
    public void return_30_when_the_next_two_pins_are_strike_too() {
        StrikeFrame strikeFrame = new StrikeFrame(new Pin("X"), new Pin("X"));

        assertThat(strikeFrame.score()).isEqualTo(30);
    }

    @Test
    public void return_17_when_the_next_two_pins_are_5_and_2() {
        StrikeFrame strikeFrame = new StrikeFrame(new Pin("5"), new Pin("2"));

        assertThat(strikeFrame.score()).isEqualTo(17);
    }
}