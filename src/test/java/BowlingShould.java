import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BowlingShould {
    private Bowling bowlingGame;

    @Mock
    LineParser lineParser;

    @Before
    public void setup() {
        this.bowlingGame = new Bowling(this.lineParser);
    }

    @Test
    public void parse_rolls_creating_frames() {
        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        bowlingGame.score(rolls);

        verify(this.lineParser, times(1)).parse(rolls);
    }

    @Test
    public void get_score_iterating_each_frame() {
        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        List<FrameParser> parsers = new ArrayList();

        for (int i = 0; i < 10; i++) {
            FrameParser parser = mock(FrameParser.class);

            parsers.add(parser);
        }

        when(this.lineParser.parse(rolls)).thenReturn(parsers);

        bowlingGame.score(rolls);

        for (FrameParser parser : parsers) {
            verify(parser, times(1)).score();
        }
    }

    @Test
    public void scores_is_the_sum_of_all_score_frames() {
        String rolls = "X|X|X|X|X|X|X|X|X|X||XX";

        List<FrameParser> parsers = new ArrayList();

        for (int i = 0; i < 10; i++) {
            FrameParser parser = mock(FrameParser.class);

            when(parser.score()).thenReturn(30);

            parsers.add(parser);
        }

        when(this.lineParser.parse(rolls)).thenReturn(parsers);

        int score = bowlingGame.score(rolls);

        assertThat(score).isEqualTo(300);
    }
}
