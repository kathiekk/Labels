package transformations;

import java.util.Scanner;

public class TextTransformationFactory {
    public TextTransformation getTransformation(int choice) {
        switch (choice) {
            case 1:
                return new CapitalizeTransformation();
            case 2: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Write string to censor");
                String answer = scanner.nextLine();
                scanner.close();
                return new CensorTransformation(answer);
            }
            case 3:
                return new CompositeTransformation();
            case 4:
                return new DecorateTransformation();
            case 5:
                return new LeftTrimTransformation();
            case 6:
                return new NormalizeSpaceTransformation();
            case 7: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Write string to replace");
                String stringToReplace = scanner.nextLine();
                System.out.println("Write replacing string");
                String replacingString = scanner.nextLine();
                scanner.close();
                return new ReplaceTransformation(stringToReplace, replacingString);
            }
            case 8:
                return new RightTrimTransformation();
            default:
                throw new IllegalArgumentException("Invalid transformation choice!");
        }
    }
}