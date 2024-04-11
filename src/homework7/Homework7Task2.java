package homework7;
import java.util.Scanner;
import java.util.Random;

public class Homework7Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetRow = random.nextInt(0,5); // Генерация начального положения цели
        int targetCol = random.nextInt(0,5);

        System.out.println("All Set. Get ready to rumble!");

        char[][] board = new char[5][5]; // Борд, куда еще не выстрелили
        boolean[][] track = new boolean[5][5]; // Борд, куда выстрелили


        for (int i = 0; i < 5; i++) {  // Заполнение поля
            for (int j = 0; j < 5; j++) {
                board[i][j] = '-';
            }
        }

        while (true) { // Вывод заполненого поля
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (track[i][j]) {
                        if (i == targetRow && j == targetCol) {
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


            System.out.print("Enter row (1-5): "); // Ввод пользователем, куда он будет стрелять по строке
            int row = scanner.nextInt() - 1; // учитывая, что индексация не с 1-5, а с 0-4, нужно уменьшить ее
            while (row < 0 || row > 4) {
                System.out.print("Invalid input. Enter row (1-5): ");
                row = scanner.nextInt() - 1;
            }

            System.out.print("Enter column (1-5): "); // Ввод пользователем, куда он будет стрелять по колонке
            int column = scanner.nextInt() - 1; // тоже самое с индексацией для колонок
            while (column < 0 || column > 4) {
                System.out.print("Invalid input. Enter column (1-5): ");
                column = scanner.nextInt() - 1;
            }

            if (track[row][column]) {
                System.out.println("You already shot there. Try again."); // проверка, если выстрелил пользователь уже в ту клетку
                continue;
            }

            track[row][column] = true; // метка того, что в клетку выстрелили


            if (row == targetRow && column == targetCol) { // проверка, попал ли в цель пользователь
                System.out.println("You have won!");
                break;
            } else {
                System.out.println("Missed! Try again.");
            }
        }

        System.out.println("Updated game board:"); // вывод обновленного поля
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (track[i][j]) {
                    if (i == targetRow && j == targetCol) {
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
