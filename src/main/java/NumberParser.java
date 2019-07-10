public class NumberParser extends FrameParser {

    public NumberParser(String[] rollsParsed) {
        super(rollsParsed);
    }

    @Override
    protected boolean isMatch(String currentFrame) {
        return Pin.isNumber(currentFrame);
    }

    @Override
    protected Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze) {
        return new NumberFrame();
    }
}
