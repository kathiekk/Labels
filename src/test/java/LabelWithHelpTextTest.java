import org.junit.Test;

import static org.junit.Assert.assertEquals;
import labels.*;

public class LabelWithHelpTextTest {

    @Test
    public void assertEquals_getTextOnSimpleLabelInvoked_correctStringReturnExpected() {
        Label label = new SimpleLabel("simple label");
        LabelWithHelpText labelWithHelpText = new LabelWithHelpText(label);
        String actualText = labelWithHelpText.getText();

        assertEquals("simple label", actualText);
    }

    @Test
    public void assertEquals_getHelpTextOnHelpLabelInvoked_correctStringsReturnExpected() {
        Label helpLabel = new HelpLabel("text", "help text");
        LabelWithHelpText labelWithHelpText = new LabelWithHelpText(helpLabel);
        String actualText = labelWithHelpText.getText();
        String actualHelpText = labelWithHelpText.getHelpText();

        assertEquals("text", actualText);
        assertEquals("help text", actualHelpText);
    }

    @Test
    public void assertEquals_getHelpTextOnRichLabelInvoked_correctStringsReturnExpected() {
        RichLabel richLabel = new RichLabel("rich label", "red", "ariel", 12);
        LabelWithHelpText labelWithHelpText = new LabelWithHelpText(richLabel);
        richLabel.setHelpText("help text");
        String actualText = labelWithHelpText.getText();
        String actualHelpText = labelWithHelpText.getHelpText();

        assertEquals("rich label", actualText);
        assertEquals("help text", actualHelpText);
    }
}
