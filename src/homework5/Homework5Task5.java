package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5Task5 {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 10");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] x = new int[10];
        boolean found = false;
        Random random = new Random();
        for (int j = 0; j < x.length; j++) {
            x[j] = random.nextInt(0, 10);
            if (x[j] == a){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Такое число есть в массиве");
        }
        else {
            System.out.println("Такого числа нет в массиве");
        }

        System.out.println("Массив чисел " + Arrays.toString(x));
    }
}


