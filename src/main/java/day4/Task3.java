package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rowSum = 0; // здесь будем считать сумму ряда
        int maxSum = 0; // здесь будем хранить наибольшую сумму
        int idxNum = 0; // индекс строки

        int[][] matrix = new int[12][8]; //основной массив задачи
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++)
                matrix[i][k] = rand.nextInt(50);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++){
                rowSum += matrix[i][k];
                if (rowSum >= maxSum) {
                    maxSum = rowSum;
                    idxNum = i;
                }
            }
        }
        System.out.println(idxNum);
    }
}
