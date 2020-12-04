package day2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int storeyNum = s.nextInt();
        if (1 <= storeyNum && storeyNum <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (5 <= storeyNum && storeyNum <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (9 <= storeyNum) {
            System.out.println("Многоэтажный дом");
        } else System.out.println("Ошибка ввода");
    }
}