package homework5;

import java.util.Scanner;

public class Homework5Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversedNumber = 0;
        int temp = number;
        while (temp>0){
            int mod = temp%10;
            reversedNumber= reversedNumber*10+mod;
            temp = temp/10;
        }
            if (number==reversedNumber){
                System.out.println("Палиндром");
            }
            else {
                System.out.println("Не палиндром");
            }

        }

    }

