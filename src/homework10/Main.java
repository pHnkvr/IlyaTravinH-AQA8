package homework10;

public class Main {
    public static void main(String[] args) {

        Human father1 = new Human("Ivan", "Ivanov", 1975);
        Human mother1 = new Human("Irina", "Ivanova", 1980);
        Family family1 = new Family(mother1, father1);


        Pet pet1 = new Pet("dog", "Bobik", 3, 80, new String[]{"run", "play"});


        Human child1 = new Human("Lesya", "Ivanova", 2005, 110, pet1, mother1, father1, family1);
        family1.addChild(child1);


        System.out.println("Family 1 Info:");
        System.out.println(family1.toString());
        System.out.println("Child 1 Info:");
        System.out.println(child1.toString());
        System.out.println("Pet 1 Info:");
        System.out.println(pet1.toString());


        child1.greetPet();
        child1.describePet();
        pet1.eat();
        pet1.respond();
        pet1.foul();


        Human father2 = new Human("Petr", "Petrov", 1982);
        Human mother2 = new Human("Polina", "Petrova", 1985);
        Family family2 = new Family(mother2, father2);


        Pet pet2 = new Pet("cat", "Barsik", 20, 40, new String[]{"sleep", "purr"}); //вызов метода, где коту больше чем лет хозяину


        Human child2 = new Human("Katerina", "Petrova", 1981, 120, pet2, mother2, father2, family2); // вызов метода, где ребенок будет старше за родителей
        Human child3 = new Human("Demid", "Petrov", 2008, 110, pet2, mother2, father2, family2);
        family2.addChild(child2);
        family2.addChild(child3);
        family2.deleteChild(0); //удаление "несуществующего" ребенка

        System.out.println("\nFamily 2 Info:");
        System.out.println(family2.toString());
        System.out.println("Child 2 Info:");
        System.out.println(child2.toString());
        System.out.println("Child 3 Info:");
        System.out.println(child3.toString());
        System.out.println("Pet 2 Info:");
        System.out.println(pet2.toString());




    }
    }

