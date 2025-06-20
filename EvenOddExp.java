package code;

import java.util.Scanner;

public class EvenOddExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop to take 10 numbers as input
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter " + i + " number: ");
            int num = sc.nextInt();

            // Check if the number is even or odd
            if (num % 2 == 0) {
                System.out.println(num + " is an Even number");
            } else {
                System.out.println(num + " is an Odd number");
            }
        }

        sc.close();
    }
}
