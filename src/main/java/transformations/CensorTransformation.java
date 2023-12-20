package transformations;

public class CensorTransformation extends TextTransformation {
    String string_to_censor;

    public CensorTransformation(String w) {
        string_to_censor = w;
    }

    @Override
    public String transform(String text) {
        if(text == null || text.isEmpty())
            throw new IllegalArgumentException("Null or empty string passed!");

        int length = string_to_censor.length();
        StringBuilder censored_string = new StringBuilder();
        while (length > 0) {
            censored_string.append("*");
            length--;
        }

        return text.replaceAll(string_to_censor, censored_string.toString());
    }

    @Override
    public boolean equals(Object object) {
        if(object == null)
            return false;

        if(!getClass().equals(object.getClass()))
            return false;

        CensorTransformation other = (CensorTransformation)object;
        return string_to_censor.equals(other.string_to_censor);
    }
}
