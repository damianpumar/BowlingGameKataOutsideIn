import java.util.ArrayList;
import java.util.List;

public class Parser {
    private final String[] rollsParsed;
    private final List<FrameParser> frameParsers;

    public Parser(String[] rollsParsed) {
        this.rollsParsed = rollsParsed;

        this.frameParsers = new ArrayList() {
            {
                add(new StrikeParser(rollsParsed));
                add(new SpareParser(rollsParsed));
                add(new MissedParser(rollsParsed));
            }
        };
    }

    public Frame evaluate(int positionToAnalyze) {
        Frame frame = null;

        for (FrameParser parser : this.frameParsers) {
            frame = parser.evaluate(positionToAnalyze);

            if (frame != null)
                break;
        }

        return frame;
    }
}
