import java.util.Scanner;
public class BasicCalculator{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter first number");
float number1=sc.nextFloat();
System.out.println("Enter second number");
float number2=sc.nextFloat();
float addition=number1+number2;
float subtraction=number1-number2;
float multiplication=number1*number2;
float division=number1/number2;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+", "+subtraction+", "+multiplication+", and "+division);
}
}
