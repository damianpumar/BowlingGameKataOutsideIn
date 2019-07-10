public class NumberFrame extends Frame {
    private Pin[] pins;

    public NumberFrame(Pin... pins) {
        this.pins = pins;
    }

    @Override
    public int score() {
        int score = 0;

        for (Pin pin : this.pins) {
            score += pin.number();
        }

        return score;
    }
}
