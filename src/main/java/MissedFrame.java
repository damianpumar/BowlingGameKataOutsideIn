public class MissedFrame extends Frame {
    private Pin[] pins;

    public MissedFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        return this.pins[0].value() + this.pins[1].value();
    }
}
