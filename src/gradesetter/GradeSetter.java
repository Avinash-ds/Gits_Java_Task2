package gradesetter;

import java.util.Scanner;

public class GradeSetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input quiz, mid-term, and final scores
        System.out.print("Quiz score: ");
        int quizScore = scanner.nextInt();

        System.out.print("Mid-term score: ");
        int midtermScore = scanner.nextInt();

        System.out.print("Final score: ");
        int finalScore = scanner.nextInt();

        // Calculate the average score
        double averageScore = (quizScore + midtermScore + finalScore) / 3.0;

        // Determine the grade based on the average score
        char grade;

        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 70) {
            grade = 'B';
        } else if (averageScore >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Display the grade
        System.out.println("Your grade is " + grade);

        // Close the scanner
        scanner.close();
    }
}
