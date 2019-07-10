public class StrikeFrame extends Frame {
    private Pin[] pins;

    public StrikeFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        if (this.pins[0].isStrike() && this.pins[1].isStrike())
            return this.pins[0].score() * 3;

        return 0;
    }
}
