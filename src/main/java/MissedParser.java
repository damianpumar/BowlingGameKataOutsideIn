public class MissedParser extends FrameParser {

    public MissedParser(String[] rollsParsed) {
        super(rollsParsed);
    }

    @Override
    protected boolean isMatch(String currentFrame) {
        return false;
    }

    @Override
    protected Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze) {
        return null;
    }
}
