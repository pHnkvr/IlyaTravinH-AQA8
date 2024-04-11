package test.innerClass;

public class InnerClassExample {
    public static void main(String[] args) {
        Gym gym1 = new Gym("Kanban");
        Gym gym2 = new Gym("Scrum");

        Gym.Equipment dumbbells = gym1.new Equipment("dumbbells", 3000);
        Gym.Equipment bar = new Gym("Scrum").new Equipment("bar", 200);
        Gym.Equipment pool = new Gym("Scrum").new Equipment("pool", 20000);
        gym1.printEquipment();
        System.out.println("=====");
        bar.sellToAnotherGym(gym2, 300);
        gym1.printEquipment();
        System.out.println("=====");
        gym2.printEquipment();
        //System.out.println(dumbbells);
       // System.out.println(bar);
        gym2.addEquipmentr("ball", 20);
        gym2.printEquipment();

    }
}
