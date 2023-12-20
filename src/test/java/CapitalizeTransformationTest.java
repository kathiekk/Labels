import org.junit.Test;
import transformations.CapitalizeTransformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CapitalizeTransformationTest {
    @Test
    public void assertEquals_transformFunctionWithSampleStringInvoked_transformedStringExpected() {
        CapitalizeTransformation cap_transformation = new CapitalizeTransformation();
        String result = cap_transformation.transform("kati");

        assertEquals("Kati", result);
    }

    @Test
    public void assertThrows_transformFunctionWithNullInvoked_correctStringReturnExpected() {
        CapitalizeTransformation cap_transformation = new CapitalizeTransformation();

        assertThrows(IllegalArgumentException.class, () -> cap_transformation.transform(null));
    }

    @Test
    public void assertThrows_transformFunctionWithEmptyStringInvoked_correctStringReturnExpected() {
        CapitalizeTransformation cap_transformation = new CapitalizeTransformation();

        assertThrows(IllegalArgumentException.class, () -> cap_transformation.transform(""));
    }

    @Test
    public void assertEquals_transformFunctionInvokedOnAStringNotStartingWithLetter_noTransformationExpected() {
        CapitalizeTransformation cap_transformation = new CapitalizeTransformation();
        String result = cap_transformation.transform(" string");

        assertEquals(" string", result);
    }
}
