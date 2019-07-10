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
        Pin[] pinsOnNextFrame = this.createPin(rollsParsed[positionToAnalyze + 1]);

        if (pinsOnNextFrame.length > 1)
            return new StrikeFrame(pinsOnNextFrame);

        return new StrikeFrame(pinsOnNextFrame[0], this.createPin(rollsParsed[positionToAnalyze + 2])[0]);
    }
}
