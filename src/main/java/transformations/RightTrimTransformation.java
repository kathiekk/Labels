package transformations;

public class RightTrimTransformation extends TextTransformation {
    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Null or empty string passed!");

        int end_index = text.length() - 1;
        while(end_index >= 0 && Character.isWhitespace(text.charAt(end_index)))
            end_index--;

        return text.substring(0, end_index+1);
    }
}
