package homework10;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human [] children;
    private Pet pet;
    private int childrenCount;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[5];
        this.childrenCount=0;
    }
    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }


    public void addChild(Human child){
        if (childrenCount < children.length) {
            children[childrenCount] = child;
            child.setFamily(this);
            childrenCount++;
        } else {
            System.out.println("Cannot add more children. Array is full."); //если массив заполнен
        }
        }
        public boolean deleteChild(int index){
        if (index <0 || index >= childrenCount){
            return false;
        }
        children[index]= children[childrenCount-1]; //сдвигаем последний элемент на удаленую позицию
        children[childrenCount-1]=null;
        childrenCount--;
        return true;
        }
        public int countFamily(){
        return 2 + childrenCount; //вернет маму и папу + детей
        }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Family{mother=" + mother.getName() + ", father=" + father.getName() + ", children=[");
        for (int i = 0; i < childrenCount; i++) {
            sb.append(children[i].getName());
            if (i < childrenCount - 1) {
                sb.append(", ");
            }
        }
        sb.append("], pet=" + (pet != null ? pet.toString() : "none") + "}");
        return sb.toString();
    }
    }

