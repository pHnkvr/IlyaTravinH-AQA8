package test;

import java.util.Scanner;


public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вас интересует?");
        String scannerFromLine = scanner.nextLine();
        if (scannerFromLine.equals("Profession")){
            System.out.println("Automation Quality Assurance");

        }
        else if (scannerFromLine.equals("Programming language")){
            System.out.println("Java");
        }
        else if (scannerFromLine.equals("Group")){
            System.out.println("AQA8");
        }
        else {
            System.out.println("Information not found... Sorry");
        }
    }
}
