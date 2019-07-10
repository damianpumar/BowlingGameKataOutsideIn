import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LineParserShould {
    private LineParser lineParser;

    @Mock
    Parsers parsers;

    @Before
    public void setup() {
        this.lineParser = new LineParser(this.parsers);
    }

    @Test
    public void iterate_for_each_roll_parsing_each_roll() {
        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        this.lineParser.parse(rolls);

        verify(this.parsers, times(10)).evaluate(argThat(r -> r.equals("X")));
    }

    @Test
    public void return_a_same_frames_parsed_by_parsers_class() {
        Frame frameExpected = mock(Frame.class);

        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        when(this.parsers.evaluate(argThat(r -> r.equals("X")))).thenReturn(frameExpected);

        List<Frame> frames = this.lineParser.parse(rolls);

        for (Frame frame : frames) {
            assertThat(frame).isSameAs(frameExpected);
        }

        if (frames.size() == 0)
            fail("frames empty");
    }
}