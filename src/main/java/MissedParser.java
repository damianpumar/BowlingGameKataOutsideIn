public class MissedParser extends FrameParser {

    public MissedParser(String[] rollsParsed) {
        super(rollsParsed);
    }

    @Override
    protected boolean isMatch(String currentFrame) {
        return currentFrame.contains(Pin.MISSED);
    }

    @Override
    protected Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze) {
        return new MissedFrame(this.createPin(currentFrame)[0], this.createPin(currentFrame)[1]);
    }
}
