import java.util.ArrayList;
import java.util.List;

public class Parser {
    private final String[] rollsParsed;
    private final List<FrameParser> frameParsers;

    public Parser(String[] rollsParsed) {
        this.rollsParsed = rollsParsed;

        this.frameParsers = new ArrayList() {
            {
                add(new StrikeParser());
            }
        };
    }

    public Frame evaluate(int positionToAnalyze) {
        throw new UnsupportedOperationException();
    }
}
