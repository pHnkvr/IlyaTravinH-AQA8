package test;

import java.util.Scanner;

/*2) Написать программу, которая будет просить ввести пользователя с клавиатуры число до тех пор
пока он не введет число 13. Также программа будет выводить в консоль число, введеное пользователем,
если оно четное.*/
public class testTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        while (a!=13) {

            if (a % 2 == 0) {
                System.out.println(a);
            }
            System.out.println("Введите число");
            a = sc.nextInt();
        }

        /* do {
            System.out.println("Введите число");
            if (a%2==0){
                System.out.println(a);
            }
            else  continue;
        }
        while (a!=13);

         */
    }
}
