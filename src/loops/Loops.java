package loops;

public class Loops {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print asterisks from i+1 to rows
            for (int k = i + 1; k <= rows; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
