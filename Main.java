package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        NumberProcessor np = new NumberProcessor();
        UserInterface UI = new UserInterface(np);

        UI.start();
    }
}
