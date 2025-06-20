package code;
import java.util.Scanner;

public class Buzz {
	 public static boolean isBuzz(int n) {
	        return (n % 7 == 0 || n % 10 == 7);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter the value of p (start): ");
	        int p = sc.nextInt();

	        System.out.print("Enter the value of q (end): ");
	        int q = sc.nextInt();

	        if (p < q) {
	            System.out.println("Buzz numbers between " + p + " and " + q + " are:");
	            for (int i = p; i <= q; i++) {
	                if (isBuzz(i)) {
	                    System.out.print(i + " ");
	                }
	            }
	        } else {
	            System.out.println("Invalid input: Ensure that p < q.");
	        }

	        sc.close();
	    }
	}


