import java.util.Scanner;

public class LargestValueCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();

        boolean isFirstLargest = (firstValue > secondValue) && (firstValue > thirdValue);
        boolean isSecondLargest = (secondValue > firstValue) && (secondValue > thirdValue);
        boolean isThirdLargest = (thirdValue > firstValue) && (thirdValue > secondValue);

        System.out.println("Is the first value the largest? " + isFirstLargest);
        System.out.println("Is the second value the largest? " + isSecondLargest);
        System.out.println("Is the third value the largest? " + isThirdLargest);

        scanner.close();
    }
}
