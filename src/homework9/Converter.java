package homework9;

public class Converter {
    private String converterName;

    public Converter(String converterName) {
        this.converterName = converterName;
    }

    public String getConverterName() {
        return converterName;
    }

    public int convertToInt(byte bytes) {
        return bytes;
    }

    public int convertToInt(short shorts) {
        return shorts;
    }

    public int convertToInt(int ints) {
        return ints;
    }

    public int convertToInt(long longs) {
        return (int) longs;
    }

    public int convertToInt(char chars) {
        return chars;
    }
    public int convertToInt(float floats){
        return (int)floats;
    }
    public int convertToInt(double doubles){
        return (int)doubles;
    }
    public int convertToInt(String strings){
        return Integer.parseInt(strings);
    }
    public void convertToInt(boolean booleans){
    if (booleans== true || booleans==false){
        System.out.println("boolean");
    }
    }
}
