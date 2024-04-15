package homework9;

import java.util.Arrays;

public class ComputerMain {
    public static void main(String[] args) {
        Computer pc = new Computer("Asus", 1000,16,12);
        Computer pc2 = new Computer("Asus", 1200,16,12);
        Computer pc3 = new Computer("Acer",1000, 16,12);
        System.out.println(pc.equals(pc2));
        System.out.println(pc.equals(pc3));
        System.out.println(pc);

    }
}
