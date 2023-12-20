import org.junit.Test;
import transformations.RightTrimTransformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RightTrimTransformationTest {
    @Test
    public void assertEquals_transformFunctionOnWhitespaceStartingStringInvoked_transformationExpected() {
        RightTrimTransformation rightTrimTransformation = new RightTrimTransformation();
        String result = rightTrimTransformation.transform("    test string    ");

        assertEquals("    test string", result);
    }

    @Test
    public void assertEquals_transformFunctionOnOnlyWhitespaceStringInvoked_transformationExpected() {
        RightTrimTransformation rightTrimTransformation = new RightTrimTransformation();
        String result = rightTrimTransformation.transform("     ");

        assertEquals("", result);
    }

    @Test
    public void assertEquals_transformFunctionOnStringWithoutLeadingWhitespaceInvoked_sameStringExpected() {
        RightTrimTransformation rightTrimTransformation = new RightTrimTransformation();
        String result = rightTrimTransformation.transform("  test string");

        assertEquals("  test string", result);
    }

    @Test
    public void assertThrows_transformFunctionWithNullInvoked_correctStringReturnExpected() {
        RightTrimTransformation rightTrimTransformation = new RightTrimTransformation();

        assertThrows(IllegalArgumentException.class, () -> rightTrimTransformation.transform(null));
    }

    @Test
    public void assertThrows_transformFunctionWithEmptyStringInvoked_correctStringReturnExpected() {
        RightTrimTransformation rightTrimTransformation = new RightTrimTransformation();

        assertThrows(IllegalArgumentException.class, () -> rightTrimTransformation.transform(""));
    }
}
