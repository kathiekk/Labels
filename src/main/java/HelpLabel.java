public class HelpLabel extends SimpleLabel implements HelpText{
    String helpText;

    HelpLabel(String helpText, String text) {
        super(text);
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
}
