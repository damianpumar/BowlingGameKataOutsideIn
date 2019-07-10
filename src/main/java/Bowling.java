import java.util.List;

public class Bowling {
    private final LineParser lineParser;

    public Bowling(LineParser lineParser) {
        this.lineParser = lineParser;
    }

    public int score(String rolls) {
        int score = 0;

        List<Frame> parsers = this.lineParser.parse(rolls);

        for (Frame parser : parsers) {
            score += parser.score();
        }

        return score;
    }
}
