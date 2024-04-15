package homework9;

public class Tree {
    private String type;
    private int height;
    private int coutOfSticks;
    private String colour;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoutOfSticks() {
        return coutOfSticks;
    }

    public void setCoutOfSticks(int coutOfSticks) {
        this.coutOfSticks = coutOfSticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public Tree(String type, int height){
        this.type=type;
        this.height=height;
        this.coutOfSticks=13;
        this.colour="Зеленый";

    }
    public Tree(int height, int coutOfSticks, String colour){
        this.type="Пихта";
        this.height=height;
        this.coutOfSticks=coutOfSticks;
        this.colour=colour;

    }

    public Tree() {
        this.height = 350;
        this.coutOfSticks = 29;
        this.colour = "Желтый";
    }
    public Tree(String type){
        this();
        this.type=type;

    }
}
