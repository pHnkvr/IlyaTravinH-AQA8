package homework8;


public class Homework8Task1 {
  private int[] numbers;
  public Homework8Task1(int[]numbers){
      this.numbers = numbers;
  }
  public void printEven(){
      System.out.println("Четные числа:");
      for (int number: numbers){
          if (number % 2 ==0){
              System.out.print(number+ " ");
          }
      }
  }
  public void printOdd(){
      System.out.println("\nНечетные числа:");
      for (int number: numbers){
          if (number % 2 !=0){
              System.out.print(number+ " ");
          }
      }
  }
}
