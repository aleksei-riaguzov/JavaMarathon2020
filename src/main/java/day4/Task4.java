package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int [100];
        int sum = 0;
        int indexNum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        for (int i = 1; i < array.length - 1; i++) {
            int k  = array[i - 1] + array[i] + array[i + 1];
            if (k > sum) {
                sum = k;
                indexNum = i - 1;
            }
        }
        System.out.println(sum);
        System.out.println(indexNum);
    }
}
