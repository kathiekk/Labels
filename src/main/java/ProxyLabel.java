import java.util.Scanner;

public class ProxyLabel implements Label, HelpText{
    Label label;
    int requests = 0;
    static final int TIMEOUT = 7;

    @Override
    public String getText() {
        if (label == null) {
            System.out.println("Enter label text:");
            Scanner scanner = new Scanner(System.in);
            String inputText = scanner.nextLine();
            label = new SimpleLabel(inputText);
            scanner.close();
        }

        requests++;

        if (requests >= TIMEOUT) {
            System.out.println("Do you want to change the label text? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().toLowerCase();
            if (response.equals("yes")) {
                System.out.println("Enter new label text:");
                String newText = scanner.nextLine();
                label = new SimpleLabel(newText);
            }
            scanner.close();
            requests = 0;
        }

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
        if(label instanceof HelpText)
            ((HelpText)label).setHelpText(helpText);
    }
}
