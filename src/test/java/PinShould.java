import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PinShould {
    @Test
    public void true_when_is_Strike() {
        Pin pin = new Pin("X");

        assertThat(pin.isStrike()).isTrue();
    }
}