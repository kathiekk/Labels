public class LabelWithHelpText implements Label, HelpText{
    private Label label;

    public LabelWithHelpText(Label label) {
        this.label = label;
    }

    @Override
    public String getText() {
        return label.getText();
    }

    @Override
    public String getHelpText() {
        if(label instanceof HelpText)
            return ((HelpText)label).getHelpText();
        else
            return "No help text available!";
    }

    @Override
    public void setHelpText(String helpText) {
        ((HelpText)label).setHelpText(helpText);
    }
}
