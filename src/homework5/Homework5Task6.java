package homework5;

import java.util.Arrays;
import java.util.Random;


public class Homework5Task6 {
    public static void main(String[] args) {
        int[] i = new int[45];

        Random random = new Random();
        for (int j=0; j<i.length;j++){
            i[j]=random.nextInt(-50,50);
        }
        System.out.println(Arrays.toString(i));

        int min = i[0];
        int max = i[0];
        for (int x = 0; x < i.length;x++){
            if (min > i[x]){
                min = i[x];
            }
            if (max < i[x]){
                max = i[x];
            }
        }
        System.out.println("min from arr is " + min);
        System.out.println("max from arr is " + max);
    }
}
