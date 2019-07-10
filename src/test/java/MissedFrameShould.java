import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MissedFrameShould {
    @Test
    public void score_is_9_when_missed_frame_is_right() {
        MissedFrame missedFrame = new MissedFrame(new Pin("9"), new Pin("-"));

        assertThat(missedFrame.score()).isEqualTo(9);
    }

    @Test
    public void score_is_7_when_missed_frame_is_right() {
        MissedFrame missedFrame = new MissedFrame(new Pin("-"), new Pin("7"));

        assertThat(missedFrame.score()).isEqualTo(7);
    }
}