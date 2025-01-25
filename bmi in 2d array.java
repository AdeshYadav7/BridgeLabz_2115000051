import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][1] + ", Weight = " + personData[i][0] +
                    ", BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }
    }
}