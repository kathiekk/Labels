public class HelpLabel extends SimpleLabel implements HelpText{
    String helpText;

    HelpLabel(String text, String helpText) {
        super(text);
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
}
