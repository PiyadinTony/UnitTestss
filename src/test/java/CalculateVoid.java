import org.example.Calculator;
import org.example.Checker;
import java.util.Scanner;

public class CalculateVoid {
    public static double checkDoubleForTestMethod(String str2) {
        do {
        } while (Checker.isEmpty(str2) || !Checker.isNumber(str2) || !Checker.isLengthCorrect(str2, 3));
        return Integer.parseInt(str2);
    }
    public static boolean AddCalculateForTest(Double a,double b) {
        Calculator calculator2 = new Calculator();
        System.out.println("Enter operation (+, -, *, /):");
        String operation = "+";

        switch (operation) {
            case "+" -> calculator2.add(a, b);
            case "-" -> calculator2.subtract(a, b);
            case "*" -> calculator2.multiply(a, b);
            case "/" -> calculator2.divide(a, b);
            default -> throw new IllegalArgumentException("Invalid operation.");

        };
        return true;
    }
    public static boolean SubtractCalculateForTest(Double a,double b) {
        Calculator calculator2 = new Calculator();
        System.out.println("Enter operation (+, -, *, /):");
        String operation = "-";

        switch (operation) {
            case "+" -> calculator2.add(a, b);
            case "-" -> calculator2.subtract(a, b);
            case "*" -> calculator2.multiply(a, b);
            case "/" -> calculator2.divide(a, b);
            default -> throw new IllegalArgumentException("Invalid operation.");

        };
        return true;
    }
    public static boolean MultiplyCalculateForTest(Double a,double b) {
        Calculator calculator2 = new Calculator();
        System.out.println("Enter operation (+, -, *, /):");
        String operation = "*";

        switch (operation) {
            case "+" -> calculator2.add(a, b);
            case "-" -> calculator2.subtract(a, b);
            case "*" -> calculator2.multiply(a, b);
            case "/" -> calculator2.divide(a, b);
            default -> throw new IllegalArgumentException("Invalid operation.");

        };
        return true;
    }
    public static boolean DivideCalculateForTest(Double a,double b) {
        Calculator calculator2 = new Calculator();
        System.out.println("Enter operation (+, -, *, /):");
        String operation = "/";

        switch (operation) {
            case "+" -> calculator2.add(a, b);
            case "-" -> calculator2.subtract(a, b);
            case "*" -> calculator2.multiply(a, b);
            case "/" -> calculator2.divide(a, b);
            default -> throw new IllegalArgumentException("Invalid operation.");

        };
        return true;
    }
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            System.out.println("Result is valid");
            return true;
        } catch (Exception e) {
            System.out.println("Invalid input. Try again.");
            return false;
        }
    }

    public static boolean isEmpty(String str) {
        if (str.isEmpty()) {
            System.out.println("Invalid result, not number");
            return true;
        }
        System.out.println("Result is " + str);
        return false;
    }

    public static boolean isLengthCorrect(String str, int limit) {
        if (str.length() > limit) {
            System.out.println("Length if false");
            return false;
        }
        System.out.println("Length is true");
        return true;
    }
}
