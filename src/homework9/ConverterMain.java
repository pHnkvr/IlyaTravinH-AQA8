package homework9;

public class ConverterMain {
    public static void main(String[] args) {
        Converter converter = new Converter("test");
        System.out.println(converter.convertToInt(12.9));
        System.out.println(converter.convertToInt(40L));
        System.out.println(converter.convertToInt(13));
        System.out.println(converter.convertToInt("70"));
        System.out.println(converter.convertToInt(50.5f));
        System.out.println(converter.convertToInt((byte) 10));
        System.out.println(converter.convertToInt((short) 20));
        System.out.println(converter.convertToInt('3'));
        converter.convertToInt(true);
        converter.convertToInt(false);

    }
}
