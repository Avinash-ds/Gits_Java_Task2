package gradesetter;

import java.util.Scanner;

public class GradeFinder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Quiz score: ");
        double quizScore = myScanner.nextDouble();

        System.out.println("Mid score: ");
        double midScore = myScanner.nextDouble();

        System.out.println("Final score: ");
        double finalScore = myScanner.nextDouble();

        double averageScore = (quizScore + midScore + finalScore) / 3.0;

        System.out.println("(" + averageScore + ")" + " is your Average score");

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

        System.out.println("Your Final Grade is " + grade);
        myScanner.close();
    }
}
