package homework4;

import java.util.Scanner;

public class Homework4Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = scanner.nextDouble();
        System.out.println("Введите число b");
        double b = scanner.nextDouble();
        double result;

        result = a > b? a-b : b-a;
        System.out.println("Разница = " + result);
    }
}
