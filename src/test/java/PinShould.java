import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PinShould {
    @Test
    public void true_when_is_Strike() {
        Pin pin = new Pin("X");

        assertThat(pin.isStrike()).isTrue();
    }

    @Test
    public void false_when_is_not_Strike() {
        Pin pin = new Pin("5/");

        assertThat(pin.isStrike()).isFalse();
    }

    @Test
    public void true_when_is_Spare() {
        Pin pin = new Pin("/");

        assertThat(pin.isSpare()).isTrue();
    }

    @Test
    public void false_when_is_not_Spare() {
        Pin pin = new Pin("5");

        assertThat(pin.isSpare()).isFalse();
    }

    @Test
    public void true_when_is_a_number() {
        Pin pin = new Pin("5");

        assertThat(pin.isNumber()).isTrue();
    }

    @Test
    public void false_when_is_not_a_number() {
        Pin pin = new Pin("X");

        assertThat(pin.isNumber()).isFalse();
    }

    @Test
    public void be_5_when_a_number_is_5() {
        Pin pin = new Pin("5");

        assertThat(pin.value()).isEqualTo(5);
    }

    @Test
    public void be_10_when_is_a_strike() {
        Pin pin = new Pin("X");

        assertThat(pin.value()).isEqualTo(10);
    }

    @Test
    public void be_10_when_is_a_spare() {
        Pin pin = new Pin("/");

        assertThat(pin.value()).isEqualTo(10);
    }

    @Test
    public void be_0_when_is_miss() {
        Pin pin = new Pin("-");

        assertThat(pin.value()).isEqualTo(0);
    }
}