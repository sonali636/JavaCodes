package code;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddSplit {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		 int[] original = new int[10];
	        ArrayList<Integer> even = new ArrayList<>();
	        ArrayList<Integer> odd = new ArrayList<>();
	        System.out.println("Enter 10 elements:");
	        for (int i = 0; i < 10; i++) {
	            original[i] = sc.nextInt();
	        }

	        for (int i = 0; i < 10; i++) {
	            if (original[i] % 2 == 0) {
	                even.add(original[i]);
	            } else {
	                odd.add(original[i]);
	            }
	        }

	        System.out.println("Even numbers:");
	        for (int num : even) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nOdd numbers:");
	        for (int num : odd) {
	            System.out.print(num + " ");
	        }
	        
	        sc.close();

	}

}
