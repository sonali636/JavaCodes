package code;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        
        System.out.println("Enter 10 numbers:");

        // Get 10 numbers from user
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        // Display result
        if (primeNumbers.isEmpty()) {
            System.out.println("No prime numbers found.");
        } else {
            System.out.print("Prime numbers are: ");
            for (int i = 0; i < primeNumbers.size(); i++) {
                System.out.print(primeNumbers.get(i));
                if (i != primeNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
