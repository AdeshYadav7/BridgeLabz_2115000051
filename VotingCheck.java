import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personAge = scanner.nextInt();

        if (personAge >= 18) {
            System.out.println("The person's age is " + personAge + " and can vote.");
        } else {
            System.out.println("The person's age is " + personAge + " and cannot vote.");
        }

        scanner.close();
    }
}
