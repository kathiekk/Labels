package labelFactories;

import java.util.Scanner;
import labels.Label;
import labels.HelpText;

public class LabelWithHelpTextFactory implements LabelFactory {
    public Label createLabel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Which label type supporting help text do you want.
                 Enter your choice(number):
                 1. Rich Label
                 2. Proxy Label
                 3. Help Label""");
        int labelType = scanner.nextInt();
        Label resultLabel;

        switch (labelType) {
            case 1: {
                RichLabelFactory richLabelFactory = new RichLabelFactory();
                resultLabel = richLabelFactory.createLabel();
                break;
            }
            case 2: {
                ProxyLabelFactory proxyLabelFactory = new ProxyLabelFactory();
                resultLabel = proxyLabelFactory.createLabel();
                break;
            }
            case 3: {
                HelpLabelFactory helpLabelFactory = new HelpLabelFactory();
                resultLabel = helpLabelFactory.createLabel();
                return resultLabel;
            }
            default:
                throw new IllegalArgumentException("Invalid label type choice!");
        }

        System.out.println("Enter help text: ");
        String helpText = scanner.nextLine();
        ((HelpText)resultLabel).setHelpText(helpText);

        return resultLabel;
    }
}
