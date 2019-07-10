public class StrikeFrame extends Frame {
    private static final int MAX_VALUE = 30;
    private Pin[] pins;

    public StrikeFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        if (this.pins[0].isStrike() && this.pins[1].isStrike())
            return MAX_VALUE;

        return 0;
    }
}
