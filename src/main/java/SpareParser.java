public class SpareParser extends FrameParser {
    public SpareParser(String[] rollsParsed) {
        super(rollsParsed);
    }

    @Override
    protected boolean isMatch(String currentFrame) {
        return currentFrame.contains(Pin.SPARE);
    }

    @Override
    protected Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze) {
        return new SpareFrame(this.createPin(rollsParsed[positionToAnalyze + 1])[0]);
    }
}
