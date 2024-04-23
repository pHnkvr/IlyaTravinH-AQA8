package homework11.Task1;

public class Customer {
    private String name;
    private boolean hasDiscountCard;
    private int age;

    public Customer(String name, boolean hasDiscountCard, int age) {
        this.name = name;
        this.hasDiscountCard = hasDiscountCard;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean hasDiscountCard() {
        return hasDiscountCard;
    }

    public int getAge() {
        return age;
    }
}
