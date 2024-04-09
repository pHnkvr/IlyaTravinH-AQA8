package test;

import java.util.Arrays;
import java.util.Random;

/*
1)Заполнить массив на 10 элементов случайными числами
от -50 до +50.
Вывестив консоль сам массив.
Вывести в консоль сумму всех его элементов.
*/
public class testTask4 {
    public static void main(String[] args) {
        int[] i = new int[10];
        Random random = new Random();
        int sum = 0;

        for (int j = 0; j < i.length;j++){
            i[j]= random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(i));
        for (int j=0; j <i.length; j++){
            sum=sum+i[j];
        }
        System.out.println(sum);
   }
}
