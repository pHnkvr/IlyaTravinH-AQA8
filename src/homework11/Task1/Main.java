package homework11.Task1;

public class Main {
    public static void main(String[] args) {
        Seller seller1 = new Seller("Андрей",true);
        Customer customer1 = new Customer("Александр",true, 19);
        Product product1 = new Product("Пиво", 500, true);
        Shop shop1 = new Shop("АТБ", seller1, customer1,product1);
        shop1.calculcateCost();

        System.out.println("===========");

        Seller seller2 = new Seller("Андрей",true);
        Customer customer2 = new Customer("Александр",true, 17);
        Product product2 = new Product("Пиво", 500, true);
        Shop shop2 = new Shop("Wallmart", seller2, customer2,product2);
        shop2.calculcateCost();

        System.out.println("===========");

        Seller seller3 = new Seller("Андрей",false);
        Customer customer3 = new Customer("Иван",false, 17);
        Product product3 = new Product("Пиво", 500, true);
        Shop shop3 = new Shop("Wallmart", seller3, customer3,product3);
        shop3.calculcateCost();

        System.out.println("===========");

        Seller seller4 = new Seller("Андрей",true);
        Customer customer4 = new Customer("Ирина",false, 17);
        Product product4 = new Product("Пиво", 500, true);
        Shop shop4 = new Shop("Wallmart", seller4, customer4,product4);
        shop4.calculcateCost();

        System.out.println("===========");

        Seller seller5 = new Seller("Андрей",true);
        Customer customer5 = new Customer("Евгений",false, 18);
        Product product5 = new Product("Пиво", 500, true);
        Shop shop5 = new Shop("Wallmart", seller5, customer5,product5);
        shop5.calculcateCost();

    }
}
