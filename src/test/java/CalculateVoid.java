import org.example.Calculator;
import org.example.Checker;
import java.util.Scanner;

public class CalculateVoid {
    public static double checkDoubleForTestMethod(String str2) {
        do {
        } while (CalculateVoid.isEmpty(str2) || !CalculateVoid.isNumber(str2) || !CalculateVoid.isLengthCorrect(str2, 3));
        return Double.parseDouble(str2);
    }
    public static boolean AddCalculateForTest(Double a,double b) {
        Calculator calculator2 = new Calculator();
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
        String operation = "/";
        try {
            switch (operation) {
                case "+" -> calculator2.add(a, b);
                case "-" -> calculator2.subtract(a, b);
                case "*" -> calculator2.multiply(a, b);
                case "/" -> calculator2.divide(a, b);
                default -> throw new IllegalArgumentException("Invalid operation.");

        }
        } catch (IllegalArgumentException e) {
            return false;
        };
        return true;
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isEmpty(String str) {
        if (str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isLengthCorrect(String str, int limit) {
        if (str.length() > limit) {
            return false;
        }
        return true;
    }
}
