package code;

import java.util.Scanner;

public class MinMaxArray {
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		 int[] arr = new int[10];
		 System.out.println("enter the element of 10");
		 for(int i=0;i<10;i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		  int min = arr[0];
	        int max = arr[0];
	        for(int i=1 ; i<10; i++) {
	        	  if (arr[i] < min) {
	                  min = arr[i];
	              }
	              if (arr[i] > max) {
	                  max = arr[i];
	              }
	        }
	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);
	        
	        sc.close();
	}

}
