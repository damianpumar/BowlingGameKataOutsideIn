import java.util.ArrayList;
import java.util.List;

public class LineParser {
    private static final int QUANTITY_FRAMES = 10;
    private final ParserBuilder parserBuilder;

    public LineParser(ParserBuilder parserBuilder) {
        this.parserBuilder = parserBuilder;
    }

    public List<Frame> parse(String rolls) {
        List<Frame> frames = new ArrayList();

        Parser parser = this.parserBuilder.build(rolls);

        for (int i = 0; i < QUANTITY_FRAMES; i++) {
            frames.add(parser.evaluate(i));
        }

        return frames;
    }
}
