import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LabelsCreationTest {
    @Test
    public void assertEquals_SimpleLabelCreation_properObjectExpected() {
        SimpleLabel simple_label = new SimpleLabel("Simple");

        assertEquals("Simple", simple_label.getText());
    }

    @Test
    public void assertEquals_RichLabelCreation_properObjectExpected() {
        RichLabel rich_label = new RichLabel("Rich", "Pink", "Ariel", 12);

        assertEquals("Rich", rich_label.getText());
        assertEquals("Pink", rich_label.getColor());
        assertEquals("Ariel", rich_label.getFont());
        assertEquals(12, rich_label.getFontSize());
    }
}
