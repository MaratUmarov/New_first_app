package ru.Umarov.dz4;

import java.util.Scanner;

public class task4d {

    public static void main(String[] args) {

        System.out.println("Программа вывода геометрической прогрессии \n" +
                "Bn=B1*q^(n-1)\n" + "где n-кол-во членов пргрессии и q- знаменатель прогрессии \n" +
                "Условие b1 НЕ РАВНО 0 И q НЕ РАВНО 0 \n" +
                "Для выхода просто нажмите любую букву");
        while (true) {
            Scanner in = new
                    Scanner(System.in);
            System.out.println("первый член вашей прогрессии b1= ");
            boolean br = in.hasNextInt(); // прерывание по требованию
            if (!br) break;
            int b1 = in.nextInt();
            if (b1 == 0) {
                System.out.println("Не верные данные");
                continue;
            }
            System.out.print("кол-во членов вашей прогресси n= ");
            int n = in.nextInt();
            System.out.print("знаменатель прогрессии q= ");
            int q = in.nextInt();
            if (q == 0) {
                System.out.println("Не верные данные");
                continue;
            }
            for (int i = 1; i <= n; i++) {
                double stepen = i - 1;
                int GProgress = (int) (b1 * (Math.pow(q, stepen)));
                System.out.printf("%4d", GProgress);
            }
            System.out.println();
            System.out.println("Сумма геометрической прогрессии");
            int GSum = (int) ((b1 * (Math.pow(q, n) - 1)) / (q - 1));
            System.out.println(GSum);
        }
    }
}
