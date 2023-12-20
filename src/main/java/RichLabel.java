public class RichLabel extends SimpleLabel {
    int font_size;
    String color;
    String font;

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
}
