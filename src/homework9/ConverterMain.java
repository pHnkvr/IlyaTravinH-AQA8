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
        System.out.println("=====");
        System.out.println(converter.convertToDouble('A'));
        System.out.println(converter.convertToDouble(12.3));
        System.out.println(converter.convertToDouble(1F));
        System.out.println(converter.convertToDouble((short) 13));
        System.out.println(converter.convertToDouble((byte) 14));
        System.out.println(converter.convertToDouble("16"));
        System.out.println(converter.convertToDouble(3L));
        System.out.println(converter.convertToDouble(12));
        System.out.println("======");
        System.out.println(converter.convertToString((byte) 1));
        System.out.println(converter.convertToString(12));
        System.out.println(converter.convertToString('2'));
        System.out.println(converter.convertToString(2L));
        System.out.println(converter.convertToString(4F));
        System.out.println(converter.convertToString(16.7));
        System.out.println(converter.convertToString((short) 11));
        System.out.println(converter.convertToString("28"));
    }
}
