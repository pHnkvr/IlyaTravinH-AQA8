package homework5;


import java.util.Scanner;

public class Homework5Task4 {
    public static void main(String[] args) {
        String [] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int [] time = {10, 12, 14, 16, 18, 20};
        String [] building = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        String result = "{NAME} будет идти в {BUILDING} в {TIME}:00";
        String[] str = new String[time.length];
        for(int i = 0; i<time.length; i++){
            str[i]= String.valueOf(time[i]);
        }

        System.out.println("Введите три числа через ENTER");
        int indexOfName = new Scanner(System.in).nextInt();
        int indexOfTime = new Scanner(System.in).nextInt();
        int indexOfBuildings = new Scanner(System.in).nextInt();
        if (indexOfName<0||indexOfName>6){
            System.out.println("Введите валидное значение имени от 0 до 6");
            indexOfName = new Scanner(System.in).nextInt();
        }
        if (indexOfTime<0||indexOfTime>5){
            System.out.println("Введите валидное значение времени от 0 до 6");
            indexOfTime = new Scanner(System.in).nextInt();
        } if (indexOfBuildings<0||indexOfBuildings>5){
            System.out.println("Введите валидное значение здания от 0 до 6");
            indexOfBuildings = new Scanner(System.in).nextInt();
        }

        int N = indexOfName;
        int T = indexOfTime;
        int B = indexOfBuildings;

        System.out.println(result.replace("{NAME}", names[N]).replace("{BUILDING}", building[B]).replace("{TIME}", str[T]));

    }
}
