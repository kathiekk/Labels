import transformations.TextTransformation;
import labels.Label;

public class Decorator implements Label{
    Label label;
    TextTransformation transformation;

    public Decorator(Label l, TextTransformation t) {
        label = l;
        transformation = t;
    }

    public String getText() {
        return transformation.transform(label.getText());
    }

    boolean appliesTheSameTransformation(Decorator other) {
        return transformation.equals(other.transformation);
    }

    public static Label removeDecoratorFrom(Label label, Decorator whatToRemove) {
        if(label == null) {
            throw new IllegalArgumentException("Null passed!");
        } else if (Decorator.class.isAssignableFrom(label.getClass())) {
            Decorator decorator = (Decorator)label;
            return decorator.removeDecorator(whatToRemove);
        } else
            return label;
    }

    public Label removeDecorator(Decorator whatToRemove) {
        if(this.appliesTheSameTransformation(whatToRemove)) {
            return label;
        } else if (Decorator.class.isAssignableFrom(label.getClass())) {
            label = ((Decorator)label).removeDecorator(whatToRemove);

            return this;
        } else
            return this;
    }
}
