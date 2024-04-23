package homework11.Task3;

public class Father {
    private String name;
    private double money;

    public Father(String name, double money) {
        this.name = name;
        this.money = money;
    }
    public void shopping(Shop shop, ProductName[] productNames, int [] quantities) throws NegativeNumberOfCountException, ZeroCountException, OverPriceException, InvalidNumberException, NonAllowedProductException, TooManyItemsException{
    if (productNames.length!=quantities.length){
        throw new IllegalArgumentException("Количество продуктов должно совпадать с количеством покупок");
    }
    if (productNames.length>2){
        throw new TooManyItemsException("Можно купить не более 2 типов продуктов");
    }
    double result = 0.0;
    for (int i =0; i<quantities.length;i++){
        if (quantities[i]<=0){
            throw new NegativeNumberOfCountException("Количество продуктов не может быть меньше  0");
        }
    }
    if (productNames.length >=3){
        for (int i = 2; i<productNames.length;i++){
            if (quantities[i]==0){
                throw new ZeroCountException("Нельзя покупать три и более товара с нулевым количеством");
            }
        }
    }

    for (int i = 0; i<productNames.length; i++){
        Product product = shop.getProduct(productNames[i]);
    if (product==null){
        throw new IllegalArgumentException("Продукт " + productNames[i] +" не найден");
    }
    if (productNames[i] == ProductName.BEER|| productNames[i]==ProductName.SIGARETES){
        throw new NonAllowedProductException("Нельзя нести пиво или сигареты");
    }
    if (quantities[i]%3!=0){
        throw new InvalidNumberException("Количество " +productNames[i].name()+ " не делится на 3");
    }
    result = result + product.getPrice()*quantities[i];
    }
    if (result > money){
        throw new OverPriceException("Недостаточно средств для покупки");
    }
        System.out.println("Уважаемый "+ name + ", стоимость ваших покупок составляет "+result);
        for (int i = 0; i < productNames.length; i++){
            System.out.println("Вы приобрели "+ productNames[i].name()+ " в количестве " +quantities[i] + " шт.");
        }
    }
}
