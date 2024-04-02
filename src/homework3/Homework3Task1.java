package homework3;

public class Homework3Task1 {
    /*Создать переменную string1 = "This line that i want to cut, cause it is too long".
Создать строку string2 в которой должно быть помещено значение строки string1,
Обрезанное до "This line that i want to cut, cause".
Создать строку string3 на основе string2 которое будет содержать значение
"This line that don't want to cut, cause it is perfect".
Вывести на консоль каждое сообщение и его длину.
*/
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.replace("it is too long", "").trim();
        String[] string3 = string2.replace("i want to cut, cause", "don't want to cut, cause it is perfect").split(" ");

        System.out.println(string3[0]+" "+string3[0].length());
        System.out.println(string3[1]+" "+string3[1].length());
        System.out.println(string3[2]+" "+string3[2].length());
        System.out.println(string3[3]+" "+string3[3].length());
        System.out.println(string3[4]+" "+string3[4].length());
        System.out.println(string3[5]+" "+string3[5].length());
        System.out.println(string3[6]+" "+string3[6].length());
        System.out.println(string3[7]+" "+string3[7].length());
        System.out.println(string3[8]+" "+string3[8].length());
        System.out.println(string3[9]+" "+string3[9].length());
        System.out.println(string3[10]+" "+string3[10].length());

    }
}
