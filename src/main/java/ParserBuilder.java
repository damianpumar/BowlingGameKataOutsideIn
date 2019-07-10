import java.util.ArrayList;
import java.util.regex.Pattern;

public class ParserBuilder {
    private static final String FRAME_BOUNDARY = "|";

    public Parser build(String rolls) {
        String[] rollsParsed = this.parse(rolls);

        return new Parser(rollsParsed);
    }

    private String[] parse(String rolls) {
        ArrayList<String> parsed = new ArrayList();

        for (String roll : rolls.split(Pattern.quote(FRAME_BOUNDARY))) {
            if (roll.equals("")) continue;

            parsed.add(roll);
        }

        return parsed.toArray(new String[]{});
    }
}
