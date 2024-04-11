package test;

import java.util.Date;

public class ClassWithStaticBlocks {
    static Date date;

    static double USD;
    static double EUR;
    public static double getUSDFromBank(){
        return 39.5;
    }
    public static double getEURFromBank(){
        return 43.2;
    }
    static {
        System.out.println("i am static block");
        USD = getUSDFromBank();
        EUR = getEURFromBank();
        date = new Date();
    }
    public void printDate(){
        System.out.printf("%1$ta, %1$td, %1$tB", date);
    }
public void printCurrencies(){
    System.out.println("Euro= "+ EUR);
    System.out.println("USD= "+ USD);
}
public static void justBe(){

}


}
