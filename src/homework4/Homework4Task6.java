package homework4;

import java.util.Scanner;

public class Homework4Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какая программа необходима из выбора (IntelliJ IDEA, Git, Java)?");
        String program = sc.nextLine();
        System.out.println("Какая ОС (Linux, macOS, Windows) необходима?");
        String OS = sc.nextLine();

        switch (program){
            case ("IntelliJ IDEA"):{
                switch (OS) {
                    case ("macOS"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case ("Windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    case ("Linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    default:
                        System.out.println("Такой ОС нет в списке");
                        break;
                }
                break;
                }

                case ("Git"):{
                switch (OS){
                    case ("macOS"):
                        System.out.println("https://git-scm.com/download/mac");
                    break;
                    case ("Windows"):
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    case ("Linux"):
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    default:
                        System.out.println("Такой ОС нет в списке");
                        break;
                }
                    break;

            }
            case ("Java"):{
                switch (OS){
                    case ("macOS"):
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk22-mac");
                    break;
                    case ("Windows"):
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk22-windows");
                        break;
                    case ("Linux"):
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk22-linux");
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