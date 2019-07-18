import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserShould {
    @Test
    public void create_instance_of_StrikeFrame_when_rolls_contain_Strike() {
        String[] rolls = new String[]{"X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        Parser parser = new Parser(rolls);

        Frame frame = parser.evaluate(0);

        assertThat(frame).isInstanceOf(StrikeFrame.class);
    }

    @Test
    public void create_instance_of_SpareFrame_when_rolls_contain_Strike() {
        String[] rolls = new String[]{"5/", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        Parser parser = new Parser(rolls);

        Frame frame = parser.evaluate(0);

        assertThat(frame).isInstanceOf(SpareFrame.class);
    }

    @Test
    public void create_instance_of_MissedFrame_when_rolls_contain_Strike() {
        String[] rolls = new String[]{"5-", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        Parser parser = new Parser(rolls);

        Frame frame = parser.evaluate(0);

        assertThat(frame).isInstanceOf(MissedFrame.class);
    }

    @Test
    public void create_instance_of_NumberFrame_when_rolls_contain_Strike() {
        String[] rolls = new String[]{"51", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        Parser parser = new Parser(rolls);

        Frame frame = parser.evaluate(0);

        assertThat(frame).isInstanceOf(NumberFrame.class);
    }

    @Test
    public void get_null_when_rolls_not_supported() {
        String[] rolls = new String[]{"??", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X",};

        Parser parser = new Parser(rolls);

        Frame frame = parser.evaluate(0);

        assertThat(frame).isNull();
    }
}