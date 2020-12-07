package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int [100000];
        int maxSum = 0;
        int indexNum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        for (int i = 0; i < array.length - 50; i++) {
            int sum = 0;
            for (int j = i; j < i + 50; j++){
                sum += array[j];
                if (sum >= maxSum){
                    maxSum = sum;
                    indexNum = i;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(indexNum);
    }
}
