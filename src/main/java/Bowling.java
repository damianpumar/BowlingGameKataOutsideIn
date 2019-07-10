public class Bowling {
    private LineParser lineParser;

    public Bowling(LineParser lineParser) {
        this.lineParser = lineParser;
    }

    public int score(String rolls) {
        this.lineParser.parse(rolls);

        return 0;
    }
}
