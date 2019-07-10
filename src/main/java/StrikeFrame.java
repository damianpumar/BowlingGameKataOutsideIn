public class StrikeFrame extends Frame {
    private static final int MAX_VALUE = 30;
    private static final int MIN_VALUE = 10;
    private Pin[] pins;

    public StrikeFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        if (this.pins[0].isStrike() && this.pins[1].isStrike())
            return MAX_VALUE;

        if (this.pins[0].isNumber() && this.pins[1].isNumber())
            return MIN_VALUE + this.pins[0].number() + this.pins[1].number();

        if (this.pins[1].isSpare())
            return MIN_VALUE * 2;

        if (this.pins[0].isMiss() && this.pins[1].isNumber())
            return MIN_VALUE + this.pins[1].number();

        if (this.pins[1].isMiss() && this.pins[0].isNumber())
            return MIN_VALUE + this.pins[0].number();

        return 0;
    }
}
