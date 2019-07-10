public class Pin {
    private String value;

    public Pin(String value) {
        this.value = value;
    }

    public boolean isStrike() {
        throw new UnsupportedOperationException();
    }

    public int score() {
        throw new UnsupportedOperationException();
    }
}
