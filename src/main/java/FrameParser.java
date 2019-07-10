public abstract class FrameParser {
    private final String[] rollsParsed;

    public FrameParser(String[] rollsParsed) {
        this.rollsParsed = rollsParsed;
    }

    public Frame evaluate(int positionToAnalyze) {
        String currentFrame = this.rollsParsed[positionToAnalyze];

        if (isMatch(currentFrame)) {
            return this.createFrame(this.rollsParsed, currentFrame, positionToAnalyze);
        }

        return null;
    }

    protected abstract boolean isMatch(String currentFrame);

    protected abstract Frame createFrame(String[] rollsParsed, String currentFrame, int positionToAnalyze);
}
