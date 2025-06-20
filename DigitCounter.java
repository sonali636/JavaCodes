package code;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        // Handle case for 0
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

     
        System.out.println("Number of digits = " + count);

       
        if (count % 2 == 0) {
            System.out.println("The number contains even number of digits.");
        } else {
            System.out.println("The number contains odd number of digits.");
        }

        sc.close();
    }
}
