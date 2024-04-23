package homework11.Task1;

public class Product {
    private String name;
    private double price;
    private boolean isAlcoholic;

    public Product(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}
