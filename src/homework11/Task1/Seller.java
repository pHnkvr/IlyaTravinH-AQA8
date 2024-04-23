package homework11.Task1;

public class Seller {
    private String name;
    private boolean isHonest;

    public Seller(String name, boolean isHonest) {
        this.name = name;
        this.isHonest = isHonest;
    }
    public String getName(){
        return name;
    }
    public boolean isHonest(){
        return isHonest;
    }
}
