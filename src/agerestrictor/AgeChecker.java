package agerestrictor;

public class AgeChecker {
    public static void main(String[] args) {
        int Age = 17;

        if (Age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote. Age doesn't meet the requirement");
        }
    }
}
