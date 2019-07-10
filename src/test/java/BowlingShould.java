import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
}
