import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpareFrameShould {
    @Test
    public void return_12_when_the_next_pin_is_2() {
        SpareFrame spareFrame = new SpareFrame(new Pin("2"));

        assertThat(spareFrame.score()).isEqualTo(12);
    }

    @Test
    public void return_10_when_the_next_pin_is_missed() {
        SpareFrame spareFrame = new SpareFrame(new Pin("-"));

        assertThat(spareFrame.score()).isEqualTo(10);
    }
}