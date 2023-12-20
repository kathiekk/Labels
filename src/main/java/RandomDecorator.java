import transformations.TextTransformation;

import java.util.List;

public class RandomDecorator implements Label {
    Label label;
    List<TextTransformation> transformations;

    public RandomDecorator(Label l, List<TextTransformation> t) {
        label = l;
        transformations = t;
    }

    @Override
    public String getText() {
        int index = (int)(Math.random() * transformations.size()); //since min is 0

        return transformations.get(index).transform(label.getText());
    }
}
