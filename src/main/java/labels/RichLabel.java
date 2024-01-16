package labels;

public class RichLabel extends SimpleLabel implements HelpText {
    int fontSize;
    String color;
    String font;
    private String helpText;

    public RichLabel(String text, String color, String font, int fontSize) {
        super(text);
        this.color = color;
        this.font = font;
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getColor() {
        return color;
    }

    public String getFont() {
        return font;
    }

    @Override
    public String getHelpText() {
        return helpText;
    }

    @Override
    public void setHelpText(String helpText) { this.helpText = helpText; }
}
