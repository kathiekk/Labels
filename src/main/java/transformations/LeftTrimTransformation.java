package transformations;

public class LeftTrimTransformation extends TextTransformation {
    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Empty String or null passed!");

        int start_index = 0;
        while(start_index < text.length() && Character.isWhitespace(text.charAt(start_index)))
            start_index++;

        return text.substring(start_index);
    }
}
