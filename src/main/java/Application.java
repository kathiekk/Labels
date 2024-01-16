import labelFactories.*;
import transformations.TextTransformation;
import transformations.TextTransformationFactory;
import labels.Label;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select label type(by it`s number): ");
        System.out.println("""
                 1. Simple label
                 2. Rich label
                 3. Proxy label
                 4. Label with Help Text""");

        int choice = scanner.nextInt();
        LabelFactory labelFactory;

        switch (choice) {
            case 1:
                labelFactory = new SimpleLabelFactory();
                break;
            case 2:
                labelFactory = new RichLabelFactory();
                break;
            case 3:
                labelFactory = new ProxyLabelFactory();
                break;
            case 4:
                labelFactory = new LabelWithHelpTextFactory();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Do you want to apply a transformation? (y/n)");
        char applyTransformation = scanner.next().charAt(0);

        if(applyTransformation == 'y') {
            TextTransformationFactory transformationFactory = new TextTransformationFactory();
            System.out.println("""
                    Select transformation type(by number):
                     1. Capitalize Transformation
                     2. Censor Transformation
                     3. Composite Transformation
                     4. Decorate Transformation
                     5. Left Trim Transformation
                     6. Normalize Space Transformation
                     7. Replace Transformation
                     8. Right Trim Transformation""");
            int transformationType = scanner.nextInt();
            TextTransformation transformation = transformationFactory.getTransformation(transformationType);
            labelFactory = new DecoratorFactory(labelFactory, transformation);
        }

        LabelService labelService = new LabelService(labelFactory);
        Label label = labelService.createLabel();
    }
}
