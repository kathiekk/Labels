package transformations;

public class DecorateTransformation extends TextTransformation {
    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Null or empty string passed");

        return "-={ " + text + " }=-";
    }
}
