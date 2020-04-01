package ru.Umarov.dz4;

import java.util.Scanner;

public class task2 {

    public static void main(String[] arg) {
        System.out.println("Программа анализа введенного числа");
        System.out.println("Введите число , которое необходимо проанализировать");
        System.out.println("Ведите целое число");

        while (true) {
            Scanner in = new
                    Scanner(System.in);
            boolean btest = in.hasNextInt();
            if (!btest) {
                System.out.println("Ошибка! Число должно быть целым!");
                continue;
            }
            int num = in.nextInt();
            // Анализ числа

            if (num < 0) System.out.println("Ваше число является отрицательным\n");
           if (num==0) System.out.println("Ваше число нулевое\n");
            else System.out.println("Ваше число является положительным");
            double even;
            even = num % 2;
            if (even == 0 || num==0) System.out.println("Ваше число четное\n");
            else System.out.println("Ваше число не четное\n");
            in.close();
            break;
        }
    }
}

