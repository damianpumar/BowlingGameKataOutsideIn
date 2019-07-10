public class MissedFrame extends Frame {
    private Pin[] pins;

    public MissedFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        if (this.pins[1].isMiss())
            return this.pins[0].number();

        return this.pins[1].number();
    }
}
