package converter;

import java.util.Scanner;

public class UserInterface {
    private NumberProcessor np;
    private Scanner scanner;

    public UserInterface(NumberProcessor np) {
        this.np = np;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean userWantToExit = false;

        while (!userWantToExit) {
            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
            String baseNumber = scanner.nextLine();

            if (baseNumber.equals("/exit")) {
                break;
            }

            String[] splitter = baseNumber.split(" ");
            String firstBase = splitter[0];
            String secondBase = splitter[1];
            this.np.rememberBaseConverter(firstBase, secondBase);

        }
    }
}

