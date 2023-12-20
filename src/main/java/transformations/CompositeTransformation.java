package transformations;

import java.util.ArrayList;
import java.util.List;

public class CompositeTransformation extends TextTransformation {
    List<TextTransformation> transformations = new ArrayList<TextTransformation>();

    public void add(TextTransformation tr) {
        if(tr == null)
            throw new IllegalArgumentException("Null passed!");

        transformations.add(tr);
    }

    public void remove(TextTransformation tr) {
        for(int i = 0; i < transformations.size(); i++) {
            if(transformations.get(i).equals(tr)) {
                transformations.remove(tr);
                break;
            }
        }
    }

    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Empty string or null passed!");

        for (TextTransformation transformation : transformations) {
            text = transformation.transform(text);
        }

        return text;
    }
}
