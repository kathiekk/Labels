package labelFactories;

import labels.Label;
import labels.RichLabel;

import java.util.Scanner;

public class RichLabelFactory implements LabelFactory {
    public Label createLabel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text for Rich Label: ");
        String text = scanner.nextLine();
        System.out.print("Enter color for Rich Label: ");
        String color = scanner.nextLine();
        System.out.print("Enter font for Rich Label: ");
        String font = scanner.nextLine();
        System.out.print("Enter font size for Rich Label: ");
        int fontSize = scanner.nextInt();
        return new RichLabel(text, color, font, fontSize);
    }
}
