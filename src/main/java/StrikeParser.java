public class StrikeParser extends FrameParser {
    private static final String STRIKE = "X";

    public StrikeParser(String[] rollsParsed) {
        super(rollsParsed);
    }

    @Override
    protected boolean isMatch(String currentFrame) {
        return currentFrame.equals(STRIKE);
    }

    @Override
    protected Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze) {
        return new StrikeFrame();
    }
}
