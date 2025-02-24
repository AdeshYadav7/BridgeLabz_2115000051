import java.lang.reflect.*;
import java.util.Scanner;

class ClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.next();
        Class<?> clazz = Class.forName(className);
        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }
        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }
        System.out.println("Constructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
