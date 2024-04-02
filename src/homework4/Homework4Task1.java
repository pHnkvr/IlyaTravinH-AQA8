package homework4;

import java.util.Scanner;

public class Homework4Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу \"Я тестирую замечательно. Что еще нужно?\" ");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next()+" "+scanner.next()+" "+scanner.next();


        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        scanner.close();


    }
}
