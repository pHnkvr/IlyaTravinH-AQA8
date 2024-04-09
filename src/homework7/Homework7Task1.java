package homework7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework7Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть кількість рядків: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців: ");
        int columns = scanner.nextInt();


        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(0, 1000);
            }
        }

        int[] maxValues = new int[rows];
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxValues[i] = max;
        }


        System.out.println("Одновимірний масив максимальних значень:");
        System.out.println(Arrays.toString(maxValues));
    }
}
