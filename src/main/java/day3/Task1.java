package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String city = s.nextLine();
        while (!city.equalsIgnoreCase("stop")) {
            switch (city.toLowerCase()) { //здесь и строчкой выше я специально игнорирую регистр, чтобы программа отработала, если пользователь случайно ввел слово с маленькой буквы
                case "москва" :
                case "владивосток" :
                case "ростов":
                    System.out.println("Россия");
                    break;
                case "рим" :
                case "милан" :
                case "турин":
                    System.out.println("Италия");
                    break;
                case "ливерпуль" :
                case "манчестер" :
                case "лондон":
                    System.out.println("Англия");
                    break;
                case "берлин" :
                case "мюнхен" :
                case "кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
            city = s.nextLine();
        }
    }
}