public class RichLabel extends SimpleLabel implements HelpText {
    int font_size;
    String color;
    String font;
    public String helpText;

    RichLabel(String text, String color, String font, int font_size) {
        super(text);
        this.color = color;
        this.font = font;
        this.font_size = font_size;
    }

    int getFontSize() {
        return font_size;
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
}
