import java.util.Scanner;

public class NumberTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        if (inputNumber > 0) {
            System.out.println("positive");
        } else if (inputNumber < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        scanner.close();
    }
}
