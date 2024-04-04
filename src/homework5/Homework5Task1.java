package homework5;

import java.util.Scanner;

public class Homework5Task1 {
    public static void main(String[] args) {
        System.out.println("Введите слова до слова STOP");
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
            stringBuilder.append(sc.nextLine());
            if (sc.nextLine().equals("STOP")){
                System.out.println(stringBuilder);

            }

    }
}
