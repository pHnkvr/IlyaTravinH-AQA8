package homework11.Task1;

public class Shop implements CostCalculator{
    private String name;
    private Seller seller;
    private Customer customer;
    private Product product;

    public Shop(String name, Seller seller, Customer customer, Product product) {
        this.name = name;
        this.seller = seller;
        this.customer = customer;
        this.product = product;
    }

    @Override
    public void calculcateCost() {

        if (product.isAlcoholic() && seller.isHonest() && customer.getAge()<18){
            System.out.println("Продавец "+ seller.getName() + " не продаст алкогольный товар " +customer.getName()+ " в нашем магазине \""+name+"\". Покупателю должно быть больше 18 лет");
            return;
        }
        double result = product.getPrice();
        if (customer.hasDiscountCard()){
            result = result*0.9;
        }
        System.out.println("Уважаемый " + customer.getName() + ", продавец " + seller.getName() + " нашего магазина \"" + name + "\", продаст вам этот товар \"" + product.getName() + "\". Ваш возраст " + customer.getAge() + ". Стоимость покупки составляет " + result + " $.");
    }
}
