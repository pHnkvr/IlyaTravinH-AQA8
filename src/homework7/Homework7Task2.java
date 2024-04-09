package homework7;
import java.util.Scanner;
import java.util.Random;

public class Homework7Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Генерація початкового положення цілі
        int targetRow = random.nextInt(5);
        int targetColumn = random.nextInt(5);

        System.out.println("All Set. Get ready to rumble!");

        char[][] gameBoard = new char[5][5];
        boolean[][] shotTracker = new boolean[5][5]; // Відстеження використаних пострілів

        // Заповнення ігрового поля
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                gameBoard[i][j] = '-';
            }
        }

        while (true) {
            // Виведення ігрового поля
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (shotTracker[i][j]) {
                        if (i == targetRow && j == targetColumn) {
                            System.out.print("x ");
                        } else {
                            System.out.print("* ");
                        }
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }

            // Введення лінії та стовпчика для стрільби
            System.out.print("Enter row (1-5): ");
            int row = scanner.nextInt() - 1; // зменшуємо на 1 для індексування з 0
            while (row < 0 || row > 4) {
                System.out.print("Invalid input. Enter row (1-5): ");
                row = scanner.nextInt() - 1;
            }

            System.out.print("Enter column (1-5): ");
            int column = scanner.nextInt() - 1; // зменшуємо на 1 для індексування з 0
            while (column < 0 || column > 4) {
                System.out.print("Invalid input. Enter column (1-5): ");
                column = scanner.nextInt() - 1;
            }

            // Перевірка, чи ця клітинка вже була вистрілена
            if (shotTracker[row][column]) {
                System.out.println("You already shot there. Try again.");
                continue;
            }

            // Позначення, що вистрілена клітинка
            shotTracker[row][column] = true;

            // Перевірка попадання
            if (row == targetRow && column == targetColumn) {
                System.out.println("You have won!");
                break;
            } else {
                System.out.println("Missed! Try again.");
            }
        }

        // Виведення оновленого ігрового поля після завершення гри
        System.out.println("Updated game board:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (shotTracker[i][j]) {
                    if (i == targetRow && j == targetColumn) {
                        System.out.print("x ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
