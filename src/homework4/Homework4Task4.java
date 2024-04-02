package homework4;

import java.util.Scanner;

public class Homework4Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
        String sc = scanner.nextLine();
        if (sc.equals("1")) {
            System.out.println("Понедельник");
        }
        else if (sc.equals("2")){
            System.out.println("Вторник");
        } else if (sc.equals("3")){
            System.out.println("Среда");
        } else if (sc.equals("4")){
            System.out.println("Четверг");
        } else if (sc.equals("5")){
            System.out.println("Пятница");
        } else if (sc.equals("6")){
            System.out.println("Суббота");
        } else if (sc.equals("7")){
            System.out.println("Воскресенье");
        }
        else {
            System.out.println("Лучше бы сегодня была пятница");
        }

    }
}
