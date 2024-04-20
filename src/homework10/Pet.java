package homework10;

import java.util.Arrays;
import java.util.Objects;


public class Pet {
    private String species;
    private String name;
    private int age;
    private int trickLevel;
    private String [] habits;
    public void eat(){
        System.out.println("I'm eating!");
    }
    public void respond(){
        System.out.println("Hello, human. I am - " + name + ". I missed you!");
    }
    public void foul(){
        System.out.println("Need to hide the evidence better...");
    }
    public Pet(){

    }
    public Pet(String species, String name){
        this.species=species;
        this.name=name;
    }

    public Pet(String species, String name, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species + "{name='" + name + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;

        Pet pet = (Pet) o;

        if (age != pet.age) return false;
        if (trickLevel != pet.trickLevel) return false;
        if (!Objects.equals(species, pet.species)) return false;
        if (!Objects.equals(name, pet.name)) return false;
        return Arrays.equals(habits, pet.habits);
    }

    
    @Override
    public int hashCode() {
        int result = Objects.hash(species, name, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}

