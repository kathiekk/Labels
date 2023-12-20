package transformations;

public abstract class TextTransformation {
    public abstract String transform(String text);

    public boolean equals(Object object) {
        if(object == null)
            return false;

        return object.getClass().equals(this.getClass());
    }
}
