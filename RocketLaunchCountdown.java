import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the countdown starting number: ");
        int countdownValue = scanner.nextInt();
        
        while (countdownValue >= 1) {
            System.out.println("T-minus " + countdownValue);
            countdownValue--;
        }

        System.out.println("Liftoff! 🚀");
        
        scanner.close();
    }
}

