package test;

public class StaticMainForExample {
    public static void main(String[] args) {
      /*  ClassWithStaticBlocks classWithStaticBlocks = new ClassWithStaticBlocks();
        ClassWithStaticBlocks classWithStaticBlocks2 = new ClassWithStaticBlocks(); // не будет вызываться

       */
        //ClassWithStaticBlocks.justBe(); //отработает статичеаский блок в классе ClassWithStatickBlocks
        //ClassWithStaticBlocks classWithStaticBlocks = new ClassWithStaticBlocks(); - не отработает больше 1 раза
       /* System.out.println(ClassWithStaticBlocks.EUR);
        System.out.println(ClassWithStaticBlocks.USD);*/

        ClassWithStaticBlocks classWithStaticBlocks = new ClassWithStaticBlocks();
        classWithStaticBlocks.printCurrencies();
        classWithStaticBlocks.printDate();


    }


}
