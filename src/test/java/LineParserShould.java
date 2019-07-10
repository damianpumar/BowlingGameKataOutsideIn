import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
}