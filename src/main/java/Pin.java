import org.apache.commons.lang3.math.NumberUtils;

public class Pin {
    public static final String STRIKE = "X";
    public static final String SPARE = "/";
    public static final String MISSED = "-";

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
        return isNumber(this.value);
    }

    public static boolean isNumber(String value) {
        return NumberUtils.isParsable(value);
    }

    public int value() {
        if (isNumber())
            return Integer.parseInt(this.value);

        if (isStrike() || isSpare())
            return 10;

        return 0;
    }
}
