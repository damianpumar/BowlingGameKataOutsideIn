public class SpareFrame extends Frame {
    private static final int VALUE = 10;
    private Pin pin;

    public SpareFrame(Pin pin) {
        this.pin = pin;
    }

    @Override
    public int score() {
        return VALUE + this.pin.value();
    }
}
