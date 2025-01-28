import java.util.Scanner;
public class LeapYearCheckerL2 {
public static boolean isLeapYear(int year) {
return (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0));
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = sc.nextInt();
if (isLeapYear(year)) System.out.println("Leap Year");
else System.out.println("Not a Leap Year");
}
}
