package homework8;

public class Homework8Task1Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Homework8Task1 printNumbers = new Homework8Task1(numbers);
        printNumbers.printEven();
        printNumbers.printOdd();
    }
}
