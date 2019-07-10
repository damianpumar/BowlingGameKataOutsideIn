public class StrikeFrame extends Frame {
    private static final int MAX_VALUE = 30;
    private static final int MIN_VALUE = 10;
    private Pin[] pins;

    public StrikeFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        if (firstPin().isStrike() && secondPin().isStrike())
            return MAX_VALUE;

        if (firstPin().isNumber() && secondPin().isNumber())
            return MIN_VALUE + firstPin().number() + secondPin().number();

        if (secondPin().isSpare())
            return MIN_VALUE * 2;

        if (firstPin().isMiss() && secondPin().isNumber())
            return MIN_VALUE + secondPin().number();

        if (secondPin().isMiss() && firstPin().isNumber())
            return MIN_VALUE + firstPin().number();

        return 0;
    }

    private Pin secondPin() {
        return this.pins[1];
    }

    private Pin firstPin() {
        return this.pins[0];
    }
}
