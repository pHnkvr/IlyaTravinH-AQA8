package homework8;

public class Homework8Task2Main {
    public static void main(String[] args) {
        int [] x = {1, 3, 5, 6, 10};
        String[] string = {"Это мое сообщение"};
        Homework8Task2 printMsg = new Homework8Task2();
        printMsg.doSmth();
        printMsg.doSmth("Мое сообщение");
        printMsg.doSmth(string);
        printMsg.doSmth(x);
        printMsg.doSmth(10, "привет");
    }
}
