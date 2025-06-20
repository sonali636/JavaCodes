package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {

    public static void main(String[] args) {
        // Create a Map to store cricketer name and score
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Adding some cricketer names and scores
        cricketerScores.put("Virat Kohli", 85);
        cricketerScores.put("Rohit Sharma", 102);
        cricketerScores.put("MS Dhoni", 76);
        cricketerScores.put("Shubman Gill", 91);
        cricketerScores.put("Hardik Pandya", 45);

        // Get input from user to search for a batsman's score
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cricketer's name to search: ");
        String name = scanner.nextLine();

        // Check if name exists in map using containsKey()
        if (cricketerScores.containsKey(name)) {
            int score = cricketerScores.get(name);
            System.out.println(name + "'s score is: " + score);
        } else {
            System.out.println("Cricketer named '" + name + "' not found.");
        }

        scanner.close();
    }
}

