import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LineParser {
    private static final String FRAME_BOUNDARY = "|";
    private static final int QUANTITY_FRAMES = 10;
    private final Parsers parsers;

    public LineParser(Parsers parsers) {
        this.parsers = parsers;
    }

    public List<Frame> parse(String rolls) {

        String[] rollsParsed = rolls.split(Pattern.quote(FRAME_BOUNDARY));

        for (int i = 0; i < QUANTITY_FRAMES; i++) {
            this.parsers.evaluate(rollsParsed[i]);
        }

        return new ArrayList<Frame>();
    }
}
