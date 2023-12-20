import org.junit.Test;

import transformations.CensorTransformation;

import static org.junit.Assert.assertEquals;

public class CensorTransformationTest {
    @Test
    public void assertEquals_censorFunctionOnSampleStringInvoked_censoringExpected() {
        CensorTransformation censorTransformation = new CensorTransformation("abc");
        String result = censorTransformation.transform(" abc def abcdef");

        assertEquals(" *** def ***def", result);
    }


}
