import org.junit.Before;
import org.junit.Test;
import transformations.ReplaceTransformation;
import transformations.TextTransformation;

import static org.junit.Assert.assertEquals;

public class RemoveDecoratorTest {
    Label l;

    @Before
    public void setUp() {
        l = new SimpleLabel("abc");
        l = new Decorator(l, new ReplaceTransformation("a", "A"));
        l = new Decorator(l, new ReplaceTransformation("b", "B"));
        l = new Decorator(l, new ReplaceTransformation("c", "C"));
    }

    private void removeDecorator(TextTransformation transformationToLookFor) {
        Decorator whatToRemove = new Decorator(null, transformationToLookFor);
        l = Decorator.removeDecoratorFrom(l, whatToRemove);
    }

    @Test
    public void assertEquals_middleDecoratorRemovalOnSampleString_changedStringExpected() {
        removeDecorator(new ReplaceTransformation("b", "B"));

        String result = "AbC";
        assertEquals(result, l.getText());
    }

    @Test
    public void assertEquals_firstDecoratorRemovalOnSampleString_changedStringExpected() {
       removeDecorator(new ReplaceTransformation("a", "A"));

        String result = "aBC";
        assertEquals(result, l.getText());
    }

    @Test
    public void assertEquals_lastDecoratorRemovalOnSampleString_changedStringExpected() {
       removeDecorator(new ReplaceTransformation("c", "C"));

        String result = "ABc";
        assertEquals(result, l.getText());
    }
}
