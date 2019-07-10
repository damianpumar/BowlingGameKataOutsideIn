import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class FrameParserShould {
    @Test
    public void return_null_when_no_match_frame() {
        String[] rolls = new String[]{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        FrameParser parser = new FakeFrameParser(rolls, false, null);

        assertThat(parser.evaluate(0)).isNull();
    }

    @Test
    public void return_instance_when_match_frame() {
        String[] rolls = new String[]{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};
        Frame frame = mock(Frame.class);

        FrameParser parser = new FakeFrameParser(rolls, true, frame);

        assertThat(parser.evaluate(0)).isSameAs(frame);
    }

    public class FakeFrameParser extends FrameParser {

        private boolean isMatch;
        private Frame frame;

        public FakeFrameParser(String[] rollsParsed, boolean isMatch, Frame frame) {
            super(rollsParsed);

            this.isMatch = isMatch;
            this.frame = frame;
        }

        @Override
        protected boolean isMatch(String currentFrame) {
            return this.isMatch;
        }

        @Override
        protected Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze) {
            return this.frame;
        }
    }
}