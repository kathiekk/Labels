package transformations;

public class ReplaceTransformation extends TextTransformation {
    String string_to_replace;
    String replacing_string;

    public ReplaceTransformation(String a, String b) {
        string_to_replace = a;
        replacing_string = b;
    }

    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Null or empty string passed!");

        return text.replaceAll(string_to_replace, replacing_string);
    }

    public boolean equals(Object object) {
        if(object == null)
            return false;

        if(!getClass().equals(object.getClass()))
            return false;

        ReplaceTransformation other = (ReplaceTransformation)object;
        return string_to_replace.equals(other.string_to_replace) &&
                replacing_string.equals(other.replacing_string);
    }
}
