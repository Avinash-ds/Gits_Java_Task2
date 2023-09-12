package evennumberchecker;

public class EvenNumberChecker {
    public static void main(String[] args) {
        int number = 46;
        // used module operater to check whether the remainder is zero
        if (number % 2 == 0) {
            System.out.println("Its a even number");
        } else {
            System.out.println("Not an even number");
        }
    }
}
