package labels;

public class HelpLabel extends SimpleLabel implements HelpText{
    private String helpText;

    public HelpLabel(String text, String helpText) {
        super(text);
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }

    @Override
    public void setHelpText(String helpText) { this.helpText = helpText; }
}
