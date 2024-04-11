package homework8;

public class Homework8Task2 {


    public void doSmth(){
        System.out.println("Я пустой");
    }
    public void doSmth(String s){
        System.out.println(s);
    }
    public void doSmth(String[] s){
        for (String message: s){
            System.out.println(message.replace(" ", ", ").trim());
        }


    }
    public void doSmth(int [] i){
        int sum = 0;
        for (int numbers: i){
        sum=sum + numbers;
        }
        System.out.println("Сумма чисел в массиве = "+ sum);
    }
    public void doSmth(int i, String s){
        System.out.println("Ваше сообщение - " +s + ", ваше число - "+ i);
    }


}


