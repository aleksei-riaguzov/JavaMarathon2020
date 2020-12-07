package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int maxNum = 0;
        int minNum = 10000;
        int endsWith0 = 0;
        int endsWith0Sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        for (int numbers: array){
            if (numbers > maxNum)
                maxNum = numbers;
            if (numbers < minNum)
                minNum = numbers;
            if (numbers % 10 == 0) {
                endsWith0++;
                endsWith0Sum += endsWith0;
            }

        }
        System.out.println("наибольший элемент массива: " + maxNum);
        System.out.println("наименьший элемент массива: " + minNum);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + endsWith0);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + endsWith0Sum);
    }
}