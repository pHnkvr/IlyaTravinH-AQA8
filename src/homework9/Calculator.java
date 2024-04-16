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
            }

            if (!bool(doMath)) {
                System.out.println("Неправильна дія. Будь ласка, введіть одну з опцій: +, -, *, /");
                continue;
            }

            System.out.print("Введіть два числа через пробіл: ");
            double num1, num2;
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
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
        }

        scanner.close();
    }

    private boolean bool(String action) {
        return "+-*/".contains(action);
    }

    private void summ(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Результат: " + result);
    }

    private void minus(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Результат: " + result);
    }

    private void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Результат: " + result);
    }

    private void division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Помилка: ділення на нуль!");
        } else {
            double result = num1 / num2;
            System.out.println("Результат: " + result);
        }
    }
}
