package homework11.Task2;

public class Main {
    public static void main(String[] args) {
        ArrayGeneration arrayGeneration = new ArrayGeneration();
        try {
            double result = arrayGeneration.arrayGen();
            System.out.println("Результат деления: "+ result);
        }catch (InvalidIndex | DivisionByZero e){
            System.out.println(e.getMessage());
        }
    }
}
