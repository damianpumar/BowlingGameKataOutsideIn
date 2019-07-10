import org.apache.commons.lang3.math.NumberUtils;

public class Pin {
    public static final String STRIKE = "X";
    private static final String SPARE = "/";

    private String value;

    public Pin(String value) {
        this.value = value;
    }

    public boolean isStrike() {
        return this.value.equals(STRIKE);
    }

    public boolean isSpare() {
        return this.value.equals(SPARE);
    }

    public boolean isNumber() {
        return NumberUtils.isParsable(this.value);
    }

    public int number() {
        return Integer.parseInt(this.value);
    }
}
