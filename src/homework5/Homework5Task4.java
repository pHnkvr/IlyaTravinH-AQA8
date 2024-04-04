package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5Task4 {
    public static void main(String[] args) {
        String [] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int [] time = {10, 12, 14, 16, 18, 20};
        String [] building = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        String result = "{NAME} будет идти в {BUILDING} в {TIME}:00";
        Scanner indexOfName = new Scanner(System.in);
        Scanner indexOfTime = new Scanner(System.in);
        Scanner indexOfBuildings = new Scanner(System.in);

        String[] str = new String[time.length];
        for(int i = 0; i<time.length; i++){
            str[i]= String.valueOf(time[i]);
        }

        System.out.println("Введите три числа через ENTER");

        int N = indexOfName.nextInt();
        int T = indexOfTime.nextInt();
        int B = indexOfBuildings.nextInt();


        System.out.println(result.replace("{NAME}", names[N]).replace("{BUILDING}", building[B]).replace("{TIME}", str[T]));

    }
}
