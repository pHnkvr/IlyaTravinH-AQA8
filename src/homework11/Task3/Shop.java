package homework11.Task3;

public class Shop {
    private Product[] products;

    public Shop() {
        this.products = new Product[]{
                new Product(ProductName.APPLE, 4.0),
                new Product(ProductName.POTATO, 3.0),
                new Product(ProductName.MILK, 7.0),
                new Product(ProductName.BEER, 10.0),
                new Product(ProductName.SIGARETES, 30.0),
        };
    }
    public Product getProduct(ProductName name){
        for (Product product: products){
            if (product.getName()==name){
                return product;
            }
        }
        return null;
    }

}
