import org.junit.Test;
import transformations.ReplaceTransformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ReplaceTransformationTest {
    @Test
    public void assertEqual_replaceFunctionOnSampleStringInvoked_replacementExpected() {
        ReplaceTransformation replaceTransformation = new ReplaceTransformation("abc" , "d");
        String result = replaceTransformation.transform(" abc abcdef");

        assertEquals(" d ddef", result);
    }

    @Test
    public void assertThrows_replaceFunctionOnNullInvoked_exceptionExpected() {
        ReplaceTransformation replaceTransformation = new ReplaceTransformation("abc", "d");

        assertThrows(IllegalArgumentException.class, () -> replaceTransformation.transform(null));
    }

    @Test
    public void assertThrows_replaceFunctionOnEmptyInvoked_exceptionExpected() {
        ReplaceTransformation replaceTransformation = new ReplaceTransformation("abc", "d");

        assertThrows(IllegalArgumentException.class, () -> replaceTransformation.transform(""));
    }
}
