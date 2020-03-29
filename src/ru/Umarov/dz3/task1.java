package ru.Umarov.dz3;

import java.util.Scanner;

public class task1 {

    public static void main(String[] arg) {

        System.out.println("Игра Горячо - Холодно");
        System.out.println();
        int randomNum;
        System.out.println("Угадайте задуманное число от 0 до 100 \n" + "Если надоест, просто введите любую букву \n");
        randomNum = (int) (Math.random() * 100 + 1);
        while (true) {
            Scanner in = new
                    Scanner(System.in);
            int yourNum = 0;
            System.out.println("Ваше число");
            boolean br = in.hasNextInt(); // прерывание по требованию
            if (!br) break;
            yourNum = in.nextInt();
            //System.out.println(a); // для проверки при разработке печатал
            if (Math.abs(randomNum - yourNum) <= 5) {
                System.out.println("Горячо");
            }
            if (Math.abs(randomNum - yourNum) > 5) {
                System.out.println("Холодно");
            }
            if (randomNum == yourNum) {
                System.out.println(" Поздравляю !!! Вы угадали " + yourNum);
                System.out.println("Попробуйте еще раз нажмите 1");
                boolean br1 = in.hasNextInt(); // повторное прерывание без ошибок в проге
                if (!br1) break;
                int w = in.nextInt();
                if (w != 1) {
                    in.close();
                    break;
                }
            }
        }
    }
}