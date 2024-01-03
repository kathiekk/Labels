public class LabelWithHelpText implements Label, HelpText{
    private SimpleLabel label;

    LabelWithHelpText(SimpleLabel label) {
        this.label = label;
    }

    @Override
    public String getText() {
        return label.getText();
    }

    @Override
    public String getHelpText() {
        if(label instanceof HelpLabel)
            return ((HelpLabel)label).getHelpText();
        else
            return "No help text available!";
    }
}
