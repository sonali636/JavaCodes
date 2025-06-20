package code;

import java.util.Scanner;

public class CustomExceptionEx {
	// Method to check age and possibly throw custom exception
    static void checkAge(int age) throws AgeValidation {
        if (age < 18) {
            throw new AgeValidation("Age is not valid (must be 18 or older)");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (AgeValidation ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        scanner.close();
    }

}
