package homework8;


public class Homework8Task1 {

    public void printEvenAndOdd(int[] numbers) {

        System.out.println("Четные числа:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }


        System.out.println("\nНечетные числа:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}

