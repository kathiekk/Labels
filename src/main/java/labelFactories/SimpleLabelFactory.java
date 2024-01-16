package labelFactories;

import labels.Label;
import labels.SimpleLabel;
import java.util.Scanner;

public class SimpleLabelFactory implements LabelFactory {
    public Label createLabel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text for Simple Label: ");
        String text = scanner.nextLine();
        return new SimpleLabel(text);
    }
}
