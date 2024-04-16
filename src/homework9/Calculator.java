package homework9;

import java.util.Scanner;

public class Calculator {
    public void start() {
        System.out.println("Калькулятор запущено");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введіть дію (+, -, *, /) або 'Stop' для завершення: ");
            String doMath = scanner.nextLine();

            if (doMath.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрито");
                break;
            } else if (doMath.matches("[+\\-*/]")) {
                System.out.print("Введіть два числа через пробіл: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                scanner.nextLine(); // Очищення буфера
                switch (doMath) {
                    case "+":
                        summ(num1, num2);
                        break;
                    case "-":
                        minus(num1, num2);
                        break;
                    case "*":
                        multiply(num1, num2);
                        break;
                    case "/":
                        division(num1, num2);
                        break;
                }
            } else {
                System.out.println("Неправильна дія. Будь ласка, введіть одну з опцій: +, -, *, /");
            }
        }
        scanner.close();
    }

    public void summ(double num1, double num2) {
        System.out.println("Результат: " + (num1 + num2));
    }

    public void minus(double num1, double num2) {
        System.out.println("Результат: " + (num1 - num2));
    }

    public void multiply(double num1, double num2) {
        System.out.println("Результат: " + (num1 * num2));
    }

    public void division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Помилка: ділення на нуль!");
        } else {
            System.out.println("Результат: " + (num1 / num2));
        }
    }
}
