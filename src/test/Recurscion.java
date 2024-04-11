package test;

public class Recurscion {
    public static void main(String[] args) {
        Recurscion recurscion = new Recurscion();
        recurscion.printAllNumbers(-3);
    }
    private void printAllNumbers(int number){
        if (number==0){
            System.out.println(number);

        } else if (number<0) {
            System.out.println("Below zero");
        } else {
            System.out.println(number);
            number--;
            printAllNumbers(number);
        }


    }
}
