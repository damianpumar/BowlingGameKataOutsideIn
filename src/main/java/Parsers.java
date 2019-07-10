import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Parsers {
    private static final String FRAME_BOUNDARY = "|";

    private final List<FrameParser> parsers;

    public Parsers() {
        this.parsers = new ArrayList();
    }

    public Parser build(String rolls) {
        String[] rollsParsed = rolls.split(Pattern.quote(FRAME_BOUNDARY));

        return new Parser(this.parsers, rollsParsed);
    }
}
