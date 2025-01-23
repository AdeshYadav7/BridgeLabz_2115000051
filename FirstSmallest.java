import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();

        boolean isFirstSmallest = (firstValue < secondValue) && (firstValue < thirdValue);

        System.out.println("Is the first number the smallest?"+isFirstSmallest);

        scanner.close();
    }
}
