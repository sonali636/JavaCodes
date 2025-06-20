package code;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 25 elements for the 5x5 array:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe 5x5 array is:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
