package homework5;

import java.util.Scanner;

public class Homework5Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите лимит сдачи металла");
        int countOfWeight = 0;
        int WarehouseLimit = sc.nextInt();
        while (countOfWeight<=WarehouseLimit){

            System.out.println("Введите количество для сдачи металла");
            int tempWeight = sc.nextInt();
            if (WarehouseLimit == 0){
                System.out.println("Программа завершает работу, т.к. мест на складе нет");
                break;
            }
            if (tempWeight <= 5 && WarehouseLimit - 5 < countOfWeight + tempWeight) {
                System.out.println("Невозможно добавить вес меньше 5 кг, так как склад почти заполнен. Хотите продолжить? (да/нет)"); // реализовал проверку+ подтверждение пользователя на добавление веса >=5
                String confirm = sc.next();
                if (!confirm.equalsIgnoreCase("да")) {
                    continue;
                }
            }
            else
            if (tempWeight <= 5 ){
                System.out.println("Введите количество для сдачи металла больше 5");
                System.out.println("На складе осталось " + (WarehouseLimit-countOfWeight) + " места");
                continue;
            }

            if (countOfWeight + tempWeight > WarehouseLimit){
                System.out.println("Лимит превышен");
                System.out.println("На складе осталось " + (WarehouseLimit-countOfWeight) + " места");
                continue;
            }
            countOfWeight = countOfWeight + tempWeight;
            if (countOfWeight == WarehouseLimit){
                break;
            }

            System.out.println("На складе осталось " + (WarehouseLimit-countOfWeight) + " места");

        }
        System.out.println("Конец");

    }
}
