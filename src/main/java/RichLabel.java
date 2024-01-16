public class RichLabel extends SimpleLabel implements HelpText {
    int fontSize;
    String color;
    String font;
    private String helpText;

    RichLabel(String text, String color, String font, int fontSize) {
        super(text);
        this.color = color;
        this.font = font;
        this.fontSize = fontSize;
    }

    int getFontSize() {
        return fontSize;
    }

    String getColor() {
        return color;
    }

    String getFont() {
        return font;
    }

    @Override
    public String getHelpText() {
        return helpText;
    }

    @Override
    public void setHelpText(String helpText) { this.helpText = helpText; }
}
