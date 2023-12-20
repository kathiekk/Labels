import org.junit.Test;
import transformations.NormalizeSpaceTransformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class NormalizeSpaceTest {
    @Test
    public void assertEquals_transformFuncInvokedOnAStringWithConsecutiveSpaces_transformationExpected() {
        NormalizeSpaceTransformation normalizeSpace = new NormalizeSpaceTransformation();
        String result = normalizeSpace.transform("transform   string");

        assertEquals("transform string", result);
    }

    @Test
    public void assertEquals_transformFuncInvokedOnAStringWithNoConsecutiveSpaces_NoTransformationExpected() {
        NormalizeSpaceTransformation normalizeSpace = new NormalizeSpaceTransformation();
        String result = normalizeSpace.transform("transform string");

        assertEquals("transform string", result);
    }

    @Test
    public void assertThrows_transformFuncInvokedOnWithNull_transformationExpected() {
        NormalizeSpaceTransformation normalizeSpace = new NormalizeSpaceTransformation();

        assertThrows(IllegalArgumentException.class, () -> normalizeSpace.transform(null));
    }

    @Test
    public void assertThrows_transformFuncInvokedOnWithEmptyString_transformationExpected() {
        NormalizeSpaceTransformation normalizeSpace = new NormalizeSpaceTransformation();

        assertThrows(IllegalArgumentException.class, () -> normalizeSpace.transform(""));
    }
}
