package homework11.Task3;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Father father = new Father("Илья", 500);
        ProductName[] productNames = {ProductName.APPLE, ProductName.MILK};
        int [] quantities = {3,3};
        try {
            father.shopping(shop, productNames, quantities);
        } catch (OverPriceException | NonAllowedProductException | InvalidNumberException |TooManyItemsException | IllegalArgumentException| NegativeNumberOfCountException| ZeroCountException exception){
            System.out.println(exception.getMessage());
        }
    }
}
