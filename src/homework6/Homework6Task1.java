package homework6;

import java.util.Random;
import java.util.Scanner;

public class Homework6Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[101];
        int target = random.nextInt(0 , 100) ;
        String name;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Let the game begin!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();


            if (guess == target) {
                System.out.println("Congratulations, " + name);
                break;
            } else if (guess < target) {
                System.out.println("Your number is too small. Please, try again..");
            } else {
                System.out.println("Your number is too big. Please, try again...");
            }
        }

        scanner.close();
    }
}