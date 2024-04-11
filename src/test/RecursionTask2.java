package test;

import java.util.Scanner;

public class RecursionTask2 {
    public static void main(String[] args) {
        RecursionTask2 r = new RecursionTask2();
        //r.Credit(10000, 500, 1);
        r.takeCredit();
    }
    private void Credit(int sum, int monthPay, int counter){
        sum=sum - monthPay;
        System.out.println("Month number "+ counter + ". You need to pay "+ sum + " more");
        if (sum<=0){
            System.out.println("Credit already done in "+ counter + " month.");
        }
        else {
            counter++;
            Credit(sum, monthPay, counter);
        }
    }
    public void takeCredit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert sum of money for credit:");
        int sumOfMoney = sc.nextInt();
        System.out.println("Insert your month pay:");
        int monthPay = sc.nextInt();
        Credit(sumOfMoney, monthPay, 10);
    }
}
