package code;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find all proper divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum equals the number
        if (sum == num && num != 0) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}

