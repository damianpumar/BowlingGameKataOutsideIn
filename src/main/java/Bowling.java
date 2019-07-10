import java.util.List;

public class Bowling {
    private LineParser lineParser;

    public Bowling(LineParser lineParser) {
        this.lineParser = lineParser;
    }

    public int score(String rolls) {
        int score = 0;

        List<FrameParser> parsers = this.lineParser.parse(rolls);

        for (FrameParser parser : parsers) {
            score += parser.score();
        }

        return score;
    }
}
