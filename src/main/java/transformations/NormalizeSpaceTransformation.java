package transformations;

public class NormalizeSpaceTransformation extends TextTransformation {
    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Null or empty string passed!");

        return text.replaceAll("\\s+", " ");
    }
}
