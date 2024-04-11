package test.innerClass;

import java.util.Arrays;

public class Gym {
    private String name;

    public Gym(String name) {
        this.name = name;
    }

    public void addEquipmentr(String name, int cost){
        new Equipment(name, cost).addToAnotherGym(this, cost);
    }

    private Equipment [] equipment;
    public void printEquipment(){
        System.out.println(Arrays.toString(equipment));
    }
    public class Equipment{
        private String name;
        private int cost;

        @Override
        public String toString() {
            return "Name of gym\""+ Gym.this.name + "\" cost is "+ cost+ " " +name;
        }
        public Equipment(String name, int cost) {
            this.name = name;
            this.cost = cost;
            if(equipment == null){
                equipment = new Equipment[1];
                equipment[0] = this;
            } else {
                Equipment[] temp = new Equipment[equipment.length+1];
                for (int i=0; i<equipment.length; i++){
                    temp[i]=equipment[i];
                }
                temp[temp.length-1]= this;
                equipment = temp;

            }
        }
public void sellToAnotherGym (Gym gymBuyer, int cost){
            addToAnotherGym(gymBuyer, cost);
            deleteEquipment();
}
private void addToAnotherGym(Gym gym, int cost){
            this.cost = cost;
            if (gym.equipment == null){
                gym.equipment = new Equipment[1];
                gym.equipment[0]= this;
            }
            else {
                Equipment[]temp = new Equipment[gym.equipment.length + 1];
                for (int i = 0; i< gym.equipment.length; i++){
                    temp[i]=gym.equipment[i];
                }
                temp[temp.length-1]= this;
                gym.equipment = temp;
            }

}
private void deleteEquipment(){
    // [a, b, null, d] -> удаляем с, создаем массив, который на 1 знач меньше -> [x, x, x]
            int index = getIdOfEquipment();
            if(!(index == -1)){
                equipment[index]= null;
                Equipment[] temp = new Equipment[equipment.length-1];
                int counter = 0;
                for (int i = 0; i<equipment.length;i++){
                    if (equipment[i]==null){
                        continue;
                    }
                    temp[counter]=equipment[i];
                    counter++;
                }
                equipment=temp;
            }
}
private int getIdOfEquipment(){
            // [a, b, c, d]
            int idOfEquipment = -1;
            for (int i= 0; i<equipment.length; i++){
                if (equipment[i].name.equals(this.name)){
                    idOfEquipment = i;
                    break;
                }
            }
return idOfEquipment;
}
public void takeAllFromOuterClass(){
            printEquipment();
    System.out.println(Gym.this.name);
}

    }
}
