package homework4;

import java.util.Scanner;

public class Homework4Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну строны a");
        int a = scanner.nextInt();
        System.out.println("Введите длинну строны b");
        int b = scanner.nextInt();
        System.out.println("Введите длинну строны c");
        int c = scanner.nextInt();
        if (a+b>c){
            if (b+c>a)
                if (a+c>b)
                    System.out.println("Можно построить треугольник");
            }
        else {
            System.out.println("Треугольник построить нельзя");
        }
        }

}
