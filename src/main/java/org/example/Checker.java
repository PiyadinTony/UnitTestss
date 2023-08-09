package org.example;

import java.util.Scanner;

public class Checker {
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

    public static double checkDouble() {
        String str;
        do {
            System.out.println("Enter the number");
            Scanner input = new Scanner(System.in);
            str = input.nextLine();
        } while (Checker.isEmpty(str) || !Checker.isNumber(str) || !Checker.isLengthCorrect(str, 3));
        return Integer.parseInt(str);
    }

}
