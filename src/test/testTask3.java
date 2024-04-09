package test;

import java.util.Scanner;

public class testTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("values of *");
        int values = sc.nextInt();
        char symbol = '*';
        for (int i = 0; i < values; i++){
            for (int j = 0; i < values; j++){
                System.out.println(symbol + " " );
            }
            System.out.println();
            }

    }
}
