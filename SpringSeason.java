import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      int inputMonth=sc.nextInt();
      int inputDay=sc.nextInt();
        if (isSpringSeason(inputMonth, inputDay)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int inputMonth, int inputDay) {
        if (inputMonth == 3 && inputDay >= 20) {
            return true;
        } else if (inputMonth == 4 || inputMonth == 5) {
            return true;
        } else return inputMonth == 6 && inputDay <= 20;
    }
}
