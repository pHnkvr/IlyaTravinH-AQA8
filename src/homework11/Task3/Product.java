package homework11.Task3;

public class Product {
    private ProductName name;
    private double price;

    public Product(ProductName name, double price) {
        this.name = name;
        this.price = price;
    }

    public ProductName getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
