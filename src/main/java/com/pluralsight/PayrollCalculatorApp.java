package com.pluralsight;
import java.util.*;

public class PayrollCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask name
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        // Ask hours worked
        System.out.println("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        // Ask pay rate
        System.out.println("Enter pay rate: ");
        float payRate = scanner.nextFloat();

        double grossPay = hoursWorked * payRate;

        // Display results
        System.out.println();
        System.out.printf("%s has earned $%.2f%n2", name, grossPay);

    }
}
