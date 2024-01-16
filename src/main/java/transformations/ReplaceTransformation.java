package transformations;

public class ReplaceTransformation extends TextTransformation {
    String stringToReplace;
    String replacingString;

    public ReplaceTransformation(String a, String b) {
        stringToReplace = a;
        replacingString = b;
    }

    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Null or empty string passed!");

        return text.replaceAll(stringToReplace, replacingString);
    }

    public boolean equals(Object object) {
        if(object == null)
            return false;

        if(!getClass().equals(object.getClass()))
            return false;

        ReplaceTransformation other = (ReplaceTransformation)object;
        return stringToReplace.equals(other.stringToReplace) &&
                replacingString.equals(other.replacingString);
    }
}
