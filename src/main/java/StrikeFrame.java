public class StrikeFrame extends Frame {
    private static final int VALUE = 10;
    private Pin[] pins;

    public StrikeFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        if (secondPin().isSpare())
            return VALUE + secondPin().value();

        return VALUE + firstPin().value() + secondPin().value();
    }

    private Pin secondPin() {
        return this.pins[1];
    }

    private Pin firstPin() {
        return this.pins[0];
    }
}
