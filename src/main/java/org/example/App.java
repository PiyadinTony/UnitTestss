package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App extends Checker {
    public static void ApplicationCalculate() {
        Calculator calculator = new Calculator();

        double a = Checker.checkDouble();
        double b = Checker.checkDouble();

        System.out.println("Enter operation (+, -, *, /):");
        String operation = scanner.next();

        double result = switch (operation) {
            case "+" -> calculator.add(a, b);
            case "-" -> calculator.subtract(a, b);
            case "*" -> calculator.multiply(a, b);
            case "/" -> calculator.divide(a, b);
            default -> throw new IllegalArgumentException("Invalid operation.");
        };
        Checker.bigDecimal(result);
        System.out.println("Result: " + Checker.bigDecimal(result));
    }
}

