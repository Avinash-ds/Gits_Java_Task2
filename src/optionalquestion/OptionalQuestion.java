package optionalquestion;

import java.util.Scanner;

public class OptionalQuestion {
    public static void main(String[] args) {

        Scanner answerScanner = new Scanner(System.in);

        String question = "What is the correct way to declare a variable to store an integer value in Java?";

        String option1 = "a. int 1x=10;";
        String option2 = "b. int x=10;";
        String option3 = "c. float x=10.0f;";
        String option4 = "d. string x=\"10\";";

        System.out.println(
                question + System.lineSeparator() + option1 + System.lineSeparator() + option2 + System.lineSeparator()
                        + option3 + System.lineSeparator() + option4);
        System.out.println("Enter your choice:");

        char enteredAnswer = answerScanner.next().charAt(0);

        char correctAnswer = 'b';

        if (enteredAnswer == correctAnswer) {
            System.out.println("Correct answer");
        } else {
            System.out.println("Wong answer. Please choose one from the above options!");
        }
        answerScanner.close();
    }
}
