package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] sum = new int [12]; //вспомогательный массив, в который складываются суммы строк основного массива
        int rowCount = 0;
        int maxNum = 0;
        int rowNum = 0;
        int[][] matrix = new int[12][8]; //основной массив задачи
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++)
                matrix[i][k] = rand.nextInt(50);
        }
        for (int[] outerArray: matrix) {
            for (int innerArray: outerArray) {
                sum[rowCount] += innerArray;
            }
            if (sum[rowCount] >= maxNum){
                maxNum = sum[rowCount];
                rowNum = rowCount;
            }
            rowCount++;

        }
        //вывод сумм всех строк для проверки:
        //System.out.println(Arrays.toString(sum));
        System.out.println(rowNum);
    }
}
