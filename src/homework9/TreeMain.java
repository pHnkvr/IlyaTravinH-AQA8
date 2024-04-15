package homework9;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Сосна", 300);
        Tree tree2 = new Tree(200, 50,"Красный");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("Ель");
        System.out.println(tree1.getHeight()+" "+tree1.getType()+" "+tree1.getCoutOfSticks()+" "+tree1.getColour());
        System.out.println(tree2.getHeight()+" "+tree2.getType()+" "+tree2.getCoutOfSticks()+" "+tree2.getColour());
        System.out.println(tree3.getHeight()+" "+tree3.getType()+" "+tree3.getCoutOfSticks()+" "+tree3.getColour());
        System.out.println(tree4.getHeight()+" "+tree4.getType()+" "+tree4.getCoutOfSticks()+" "+tree4.getColour());

    }


}
