package homework10;


import java.util.Objects;


public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Family family;
    public void greetPet(){
        System.out.println("Hello, "+pet.getName()+ "!");
    }
    public void describePet(){
        String trickDescription = pet.getTrickLevel() > 50 ? "very clever" : "almost clever";
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + trickDescription + ".");
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, int year, Human mother, Human father) {
        this.name = name;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.family = family;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Human{name='").append(name)
                .append("', surname='").append(surname)
                .append("', year=").append(year);

        if (pet != null) {
            result.append(", pet=").append(pet.toString());
            if (pet.getAge() > (2024 - year)) {
                result.append(" I am older than my human, that's impossible.");
            }
        }


        if (family != null) {
            if (year < family.getMother().getYear() || year < family.getFather().getYear()) {
                result.append(" I'm older than my parents, that's impossible.");
            }
        }

        result.append("}");
        return result.toString();
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (year != human.year) return false;
        if (iq != human.iq) return false;
        if (!Objects.equals(name, human.name)) return false;
        if (!Objects.equals(surname, human.surname)) return false;
        return Objects.equals(pet, human.pet);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet);
    }
}

