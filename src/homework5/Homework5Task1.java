package homework5;

import java.util.Scanner;

public class Homework5Task1 {
    public static void main(String[] args) {
        System.out.println("Введите слова до слова STOP");
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();
        boolean Concat = true;
        while (Concat) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("STOP")) {
                Concat = false;
            } else {
                sentence.append(word).append(" ");
            }
        }
        if (sentence.length() > 0) {
            System.out.println(sentence.toString().trim());
        } else {
            System.out.println("Строка пустая");
        }
    }
}
