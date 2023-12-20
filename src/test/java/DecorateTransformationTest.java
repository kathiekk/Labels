import org.junit.Test;
import transformations.DecorateTransformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DecorateTransformationTest {
    @Test
    public void assertEquals_decorateFunctionOnSampleStringInvoked_decorationExpected() {
        DecorateTransformation decorateTransformation = new DecorateTransformation();
        String result = decorateTransformation.transform("abc");

        assertEquals("-={ abc }=-", result);
    }

    @Test
    public void assertThrows_decorateFunctionOnNullInvoked_exceptionExpected() {
        DecorateTransformation decorateTransformation = new DecorateTransformation();

        assertThrows(IllegalArgumentException.class, () -> decorateTransformation.transform(null));
    }

    @Test
    public void assertThrows_decorateFunctionOnEmptyStringInvoked_exceptionExpected() {
        DecorateTransformation decorateTransformation = new DecorateTransformation();

        assertThrows(IllegalArgumentException.class, () -> decorateTransformation.transform(""));
    }
}
