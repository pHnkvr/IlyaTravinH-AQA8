package test;

public class MainForExampleStatic {
    public static void main(String[] args) {
        ExampleStatic exampleStatic = new ExampleStatic();
        System.out.println(exampleStatic.nonStaticString); // поле относится к объекту
        System.out.println(ExampleStatic.staticString); //поле относится к классу

        //System.out.println(exampleStatic.staticString);

        ExampleStatic.staticMethod();
        exampleStatic.nonStaticMethod();
        // exampleStatic.staticMethod();

        System.out.println("=====");
        exampleStatic.printInfoWithHelpOfNonStaticMethod();
        System.out.println("=====");
        ExampleStatic.printInfoWithHelpOfStaticMethod();
        //exampleStatic.printInfoWithHelpOfStaticMethod();
    }
}
