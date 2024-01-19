import org.junit.Test;
import transformations.CensorTransformation;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class CensorTransformationFactoryTest {
    @Test
    public void assertSame_creatingTwoTransformationsWithSmallerCensoredWords_expectedTrue () {
        CensorTransformationFactory censorTransformationFactory = new CensorTransformationFactory();
        CensorTransformation firstTransformation = censorTransformationFactory.get("ala");
        CensorTransformation secondTransformation = censorTransformationFactory.get("ala");

        assertSame(firstTransformation, secondTransformation);
    }

    @Test
    public void assertNotSame_creatingTwoTransformationsWithLargerCensoredWords_expectedFalse () {
        CensorTransformationFactory censorTransformationFactory = new CensorTransformationFactory();
        CensorTransformation firstTransformation = censorTransformationFactory.get("alabala");
        CensorTransformation secondTransformation = censorTransformationFactory.get("alabala");

        assertNotSame(firstTransformation, secondTransformation);
    }
}
