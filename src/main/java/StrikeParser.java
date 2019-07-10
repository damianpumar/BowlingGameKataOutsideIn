public class StrikeParser extends FrameParser {
    public StrikeParser(String[] rollsParsed) {
        super(rollsParsed);
    }

    @Override
    protected boolean isMatch(String currentFrame) {
        return currentFrame.equals(Pin.STRIKE);
    }

    @Override
    protected Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze) {
        return new StrikeFrame(
                new Pin(rollsParsed[positionToAnalyze + 1]),
                new Pin(rollsParsed[positionToAnalyze + 2]));
    }
}
