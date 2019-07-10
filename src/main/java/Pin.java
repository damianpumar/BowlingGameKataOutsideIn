public class Pin {
    public static final String STRIKE = "X";

    private String value;

    public Pin(String value) {
        this.value = value;
    }

    public boolean isStrike() {
        return this.value.equals(STRIKE);
    }

    public int score() {
        throw new UnsupportedOperationException();
    }
}
