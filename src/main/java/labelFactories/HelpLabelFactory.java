package labelFactories;

import labels.Label;
import labels.HelpLabel;
import java.util.Scanner;

public class HelpLabelFactory implements LabelFactory {
    public Label createLabel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for Help Label: ");
        String text = scanner.nextLine();
        System.out.println("Enter help text for Help Label: ");
        String helpText = scanner.nextLine();
        return new HelpLabel(text, helpText);
    }
}
