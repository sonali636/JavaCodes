package code;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded file path
        String filePath = "C:\\Users\\sonali maurya\\Desktop\\hii.txt";

        // Get the sentence to write
        System.out.print("Enter the sentence to write: ");
        String sentence = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(sentence);
            writer.close();
            System.out.println("Sentence written to file successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
