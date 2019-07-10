import java.util.regex.Pattern;

public class ParserBuilder {
    private static final String FRAME_BOUNDARY = "|";

    public Parser build(String rolls) {
        String[] rollsParsed = rolls.split(Pattern.quote(FRAME_BOUNDARY));

        return new Parser(rollsParsed);
    }
}
