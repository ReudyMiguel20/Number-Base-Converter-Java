package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberProcessor {
    private String number;
    private int base;
    private Scanner scanner;

    public NumberProcessor() {
        this.scanner = new Scanner(System.in);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void convertDecimalToAnything() {
        System.out.println("Enter number in decimal system:");
        int numberDecimal = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter target base:");
        int base = Integer.parseInt(scanner.nextLine());

        BigInteger converter = new BigInteger(String.valueOf(numberDecimal));

        System.out.println("Conversion result: " + converter.toString(base) + "\n");
    }

    public void anythingToDecimal() {
        System.out.println("Enter source number: ");
        String sourceNumber = scanner.nextLine();
        System.out.println("Enter source base: ");
        int base = Integer.parseInt(scanner.nextLine());

        BigInteger converter = new BigInteger(sourceNumber, base);

        System.out.println("Conversion to decimal result: " + converter + "\n");
    }

    public void rememberBaseConverter(String firstBase, String secondBase) {
        while (true) {
            System.out.printf("Enter number in base %s to convert to base %s (To go back type /back)", firstBase, secondBase);
            String userInput = scanner.nextLine();

            if (userInput.equals("/back")) {
                System.out.println();
                return;
            }

            BigInteger converter = new BigInteger(userInput, Integer.parseInt(firstBase));
            String baseSecond = converter.toString(Integer.valueOf(secondBase));
            System.out.println("Conversion result: " + baseSecond + "\n");
        }
    }
}
