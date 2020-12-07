package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        int biggerThanEight = 0;
        int equalsOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        int[] array = new int[s.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            if (array[i] > 8)
                biggerThanEight++;
            if (array[i] % 2 == 0)
                even++;
            else odd++;
            if (array[i] == 1)
                equalsOne++;
            sum += array[i];
        }
        System.out.println(Arrays.toString(array) +
                            "\nДлина массива: " + array.length +
                            "\nКоличество чисел больше 8: " + biggerThanEight +
                            "\nКоличество чисел равных 1: " + equalsOne +
                            "\nКоличество четных чисел: " + even +
                            "\nКоличество нечетных чисел: " + odd +
                            "\nСумма всех элементов массива: " + sum);
        //ради разнообразия вывел результат в одном методе. Не уверен, что это лучшая практика, в следующем задании выводил элементы отдельными методами.
    }
}