package code;

import java.util.ArrayList;
import java.util.Scanner;
public class SumOfNumbers {
 public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> numbers = new ArrayList<Integer>();//declaration of arraylist

			// Input 10 numbers
			for (int i = 0; i < 10; i++) {
			    System.out.print("Enter number " + (i + 1) + ": ");
			    int number = scanner.nextInt();
			    numbers.add(number);//put number in arraylist
			}

			// Calculate and print the sum
			int sum = 0;
			for (int num : numbers) //advanced for loop
			{
			    sum += num;
			}

			System.out.println("The sum of the numbers is: " + sum);
		}
    }
}