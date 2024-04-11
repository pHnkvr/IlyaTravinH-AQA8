package test.nestedClass;

public class NestedClassExample {
    public String text = "text";
    public static String staticText = "text";
    public void method(){
        System.out.println("method");
    }
    public static String staticMethod(){
        return "staticMethod";
    }

    public static class Url{
        public final static String url1="www.www" +staticText;
        private final static String url2="www.wwww" ;
    }
    public void openUrl2(){
        System.out.println("I opened "+ Url.url2);
    }
}
