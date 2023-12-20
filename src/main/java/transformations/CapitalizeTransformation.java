package transformations;

public class CapitalizeTransformation extends TextTransformation {
    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Empty string or null passed!");

        if(Character.isLetter(text.charAt(0)))
            return Character.toUpperCase(text.charAt(0)) + text.substring(1);
        else
            return text;
    }
}
