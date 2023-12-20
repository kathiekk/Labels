import org.junit.Test;
import transformations.LeftTrimTransformation;
import transformations.ReplaceTransformation;
import transformations.RightTrimTransformation;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {
    @Test
    public void assertEquals_fewDecorationsAppliedToSimpleLabel_decoratedLabelExpected() {
        Label l = new SimpleLabel("  abc   ");
        l = new Decorator(l, new LeftTrimTransformation());
        l = new Decorator(l, new RightTrimTransformation());
        l = new Decorator(l, new ReplaceTransformation("ab", "*"));

        assertEquals("*c", l.getText());
    }
}
