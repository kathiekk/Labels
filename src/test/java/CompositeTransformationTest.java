import org.junit.Test;
import transformations.CapitalizeTransformation;
import transformations.CompositeTransformation;
import transformations.DecorateTransformation;
import transformations.ReplaceTransformation;

import static org.junit.Assert.assertEquals;

public class CompositeTransformationTest {

    @Test
    public void assertEquals_compositeTransformationOnSampleStringApplied_transformedStringExpected() {
        String sample = "abc def";
        CompositeTransformation compositeTransformation = new CompositeTransformation();
        compositeTransformation.add(new CapitalizeTransformation());
        compositeTransformation.add(new DecorateTransformation());
        compositeTransformation.add(new ReplaceTransformation("abc", "def"));
        assertEquals("-={ Abc def }=-", compositeTransformation.transform(sample));

        CompositeTransformation secondComposite = new CompositeTransformation();
        secondComposite.add(new ReplaceTransformation("abc", "def"));
        secondComposite.add(new CapitalizeTransformation());
        secondComposite.add(new DecorateTransformation());
        assertEquals("-={ Def def }=-", secondComposite.transform(sample));
    }
}
