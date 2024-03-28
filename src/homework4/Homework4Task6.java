package homework4;

import java.util.Scanner;

public class Homework4Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какая программа необходима из выбора (IntelliJ IDEA, Git, Java)?");
        String programm = sc.nextLine();
        System.out.println("Какая ОС (Linux, macOS, Windows) необходима?");
        String OS = sc.nextLine();
        switch (programm){
            case ("IntelliJ IDEA"):
                switch (OS){
                    case ("Windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    case ("Linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    case ("macOS"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    default:
                        System.out.println("Такой ОС нет в списке");
                        break;
                }
                break;
            case ("Git"):
                switch (OS){
                    case ("Windows"):
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    case ("Linux"):
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    case ("macOS"):
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    default:
                        System.out.println("Такой ОС нет в списке");
                        break;
                }
                break;

            case ("Java"):{
                    switch (OS){
                        case ("Windows"):
                            System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk22-windows");
                            break;
                        case ("Linux"):
                            System.out.println("https://www.oracle.com/java/technologies/downloads/");
                            break;
                        case ("macOS"):
                            System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk22-mac");
                            break;
                        default:
                            System.out.println("Такой ОС нет в списке");
                            break;
                    }
                    break;
                }

                default:
                System.out.println("Такой программы нет в списке");
                break;
        }


    }
}
