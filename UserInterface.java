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
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            switch (scanner.nextLine()) {
                case "/from" -> {
                    this.np.convertDecimalToAnything();
                }
                case "/to" -> {
                    this.np.anythingToDecimal();
                }
                case "/exit" -> {
                    userWantToExit = true;
                }
            }
        }
    }
}

