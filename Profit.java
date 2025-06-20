package code;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking Cost Price and Selling Price as input
        System.out.print("Enter Cost Price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sellingPrice = scanner.nextDouble();

        // Calculating Profit or Loss
        double result = sellingPrice - costPrice;

        // Displaying Result
        if (result > 0) {
            System.out.println("Profit is: " + result);
        } else if (result < 0) {
            System.out.println("Loss is: " + (-result));  // Convert to positive
        } else {
            System.out.println("No Profit No Loss.");
        }

        scanner.close();
    }
}

