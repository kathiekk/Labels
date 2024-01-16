import labelFactories.LabelFactory;
import transformations.TextTransformation;
import labels.*;

public class DecoratorFactory implements LabelFactory {
    private LabelFactory baseFactory;
    private TextTransformation transformation;

    public DecoratorFactory(LabelFactory baseFactory, TextTransformation transformation) {
        this.baseFactory = baseFactory;
        this.transformation = transformation;
    }

    public Label createLabel() {
        Label baseLabel = baseFactory.createLabel();
        return new Decorator(baseLabel, transformation);
    }
}