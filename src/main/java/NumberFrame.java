public class NumberFrame extends Frame {
    private Pin[] pins;

    public NumberFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        return this.pins[0].number() + this.pins[1].number();
    }
}
