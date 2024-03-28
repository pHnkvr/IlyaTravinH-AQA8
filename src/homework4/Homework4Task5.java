package homework4;

import java.util.Scanner;

public class Homework4Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = sc.nextDouble();
        System.out.println("Введите второе число");
        double b = sc.nextDouble();
        System.out.println("Введите один из символов (- + % / *)");

        String c = sc.next();

        double result = c.equals("-") ? a-b : c.equals("+")? a+b : c.equals("%")? a%b: c.equals("/")? a/b : c.equals("*")? a*b :
                /*c.equals("/")&& b==0?  Double.parseDouble("Деление на ноль невозможно")*/  Double.parseDouble("0");
        System.out.println(result);


    }
}
