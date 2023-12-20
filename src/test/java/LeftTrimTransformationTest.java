import org.junit.Test;
import transformations.LeftTrimTransformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LeftTrimTransformationTest {
    @Test
    public void assertEquals_transformFunctionOnWhitespaceStartingStringInvoked_transformationExpected() {
        LeftTrimTransformation leftTrimTransformation = new LeftTrimTransformation();
        String result = leftTrimTransformation.transform("    test string  ");

        assertEquals("test string  ", result);
    }

    @Test
    public void assertEquals_transformFunctionOnOnlyWhitespaceStringInvoked_transformationExpected() {
        LeftTrimTransformation leftTrimTransformation = new LeftTrimTransformation();
        String result = leftTrimTransformation.transform("     ");

        assertEquals("", result);
    }

    @Test
    public void assertEquals_transformFunctionOnStringWithoutLeadingWhitespaceInvoked_sameStringExpected() {
        LeftTrimTransformation leftTrimTransformation = new LeftTrimTransformation();
        String result = leftTrimTransformation.transform("test string  ");

        assertEquals("test string  ", result);
    }

    @Test
    public void assertThrows_transformFunctionWithNullInvoked_correctStringReturnExpected() {
        LeftTrimTransformation leftTrimTransformation = new LeftTrimTransformation();

        assertThrows(IllegalArgumentException.class, () -> leftTrimTransformation.transform(null));
    }

    @Test
    public void assertThrows_transformFunctionWithEmptyStringInvoked_correctStringReturnExpected() {
        LeftTrimTransformation leftTrimTransformation = new LeftTrimTransformation();

        assertThrows(IllegalArgumentException.class, () -> leftTrimTransformation.transform(""));
    }
}
