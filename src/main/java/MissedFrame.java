public class MissedFrame extends Frame {
    private Pin[] pins;

    public MissedFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        if (this.pins[1].isMiss())
            return this.pins[0].number();

        if (this.pins[0].isMiss())
            return this.pins[1].number();

        return 0;
    }
}