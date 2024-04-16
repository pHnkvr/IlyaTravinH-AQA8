package homework9;

import java.util.Scanner;

public class Calculator {
    private boolean bool(String action) {
        return "+-*/".contains(action);
    }

    private void sum(double num1, double num2) {
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
            System.out.println("Деление на ноль запрещено");
        } else {
            double result = num1 / num2;
            System.out.println("Результат: " + result);
        }
    }
    public void start() {
        System.out.println("Калькулятор запущен");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите символ (+, -, *, /) или 'Stop' для завершенния работы калькулятора: ");
            String doMath = scanner.nextLine();

            if (doMath.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрыт");
                break;
            }

            if (!bool(doMath)) {
                System.out.println("Неверный символ, введите один из перечисленных (+, -, *, /)");
                continue;
            }

            System.out.print("Введите два числа через пробел: ");
            double num1, num2;
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            scanner.nextLine(); //

            switch (doMath) {
                case "+":
                    sum(num1, num2);
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
}
