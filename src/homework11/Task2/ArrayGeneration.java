package homework11.Task2;

import java.util.Random;
import java.util.Scanner;

public class ArrayGeneration {
    public double arrayGen() throws InvalidIndex, DivisionByZero{
        Random random = new Random();
        int arraySize=  random.nextInt(30)+1;
        int [] array = new int[arraySize];

        for (int i = 0; i<arraySize; i++){
            array[i] = random.nextInt(31);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс массива от 0 до "+(arraySize -1));
        int index = scanner.nextInt();

        if (index<0 || index>= arraySize){
            throw new InvalidIndex("Индекс вне диапазона");

        }
        if (array[0] == 0){
            throw new DivisionByZero("Деление на 0 невозможно");
        }
        return (double) array[index]/array[0];
    }
}
