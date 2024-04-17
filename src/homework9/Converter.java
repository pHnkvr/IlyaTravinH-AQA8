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

    public double convertToDouble(byte bytes){
      return bytes;
    }
    public double convertToDouble(short shorts){
        return shorts;
    }
    public double convertToDouble(int ints){
        return ints;
    }
    public double convertToDouble(long longs){
        return longs;
    }
    public double convertToDouble(char chars){
        return chars;
    }
    public double convertToDouble(float floats){
        return floats;
    }
    public double convertToDouble(double doubles){
        return doubles;
    }
    public double convertToDouble(String strings){
        return Double.parseDouble(strings);
    }
    public String convertToString(byte bytes){
        return String.valueOf(bytes);
    }
    public String convertToString(double doubles){
        return String.valueOf(doubles);
    }
    public String convertToString(short shorts){
        return String.valueOf(shorts);
    }
    public String convertToString(int ints){
        return String.valueOf(ints);
    }
    public String convertToString(long longs){
        return String.valueOf(longs);
    }
    public String convertToString(char chars){
        return String.valueOf(chars);
    }
    public String convertToString(float floats){
        return String.valueOf(floats);
    }
    public String convertToString(String string){
        return string;
    }
}
