package test;

/*4)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
создать геттеры и сеттеры для данных полей, а также конструктор класса,
принимающий в параметры все поля данного класса.
*/
public class Auto {
    private String name;
    private int price;
    private boolean isNew;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }
    public Auto(String name, int price, boolean isNew){
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }
}
