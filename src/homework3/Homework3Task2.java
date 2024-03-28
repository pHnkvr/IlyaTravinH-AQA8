package homework3;

public class Homework3Task2 {
    /*Создать строку string = "Testing, is my favourite job".
Вывести на экран отдельно каждое слово и длину этого слова в след виде:
Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
и т.д.
Вывести на консоль true, если первое слово длиннее остальных, в
противном случае вывести false.


     */

    //без использования цикла
    public static void main(String[] args) {
        String string;
        string = "Testing, is my favourite job";
        String[] strings = string.split(" ");

        System.out.println("Word 1 is \"" + strings[0]+"\"" + ", "+ "length of this word is \"" +strings[0].length()+"\"" +" "+ (strings[0].length() < strings[0].length()));
        System.out.println("Word 2 is \"" + strings[1]+"\"" + ", "+ "length of this word is \"" +strings[1].length()+"\"" +" "+ (strings[1].length() < strings[0].length()));
        System.out.println("Word 3 is \"" + strings[2]+"\"" + ", "+ "length of this word is \"" +strings[2].length()+"\"" +" "+ (strings[2].length() < strings[0].length()));
        System.out.println("Word 4 is \"" + strings[3]+"\"" + ", "+ "length of this word is \"" +strings[3].length()+"\"" +" "+ (strings[3].length() < strings[0].length()));
        System.out.println("Word 5 is \"" + strings[4]+"\"" + ", "+ "length of this word is \"" +strings[4].length()+"\"" +" "+ (strings[4].length() < strings[0].length()));
    }
}
