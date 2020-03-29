package ru.Umarov.dz4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("Программа вывода арифметической прогрессии");
        System.out.println("An=A1+d(n-1)\n" + "где n-кол-во членов пргрессии и d- разность прогрессии");
        Scanner in = new
                Scanner(System.in);
        System.out.println("первый член вашей прогрессии a1= ");
        int a1 = in.nextInt();
        System.out.print("кол-во членов вашей прогресси n= ");
        int n = in.nextInt();
        System.out.print("разность прогрессии d= ");
        int d = in.nextInt();

        for (int i = 1; i <= n; i++) {
            int mathProgress =  (a1 + d * (i - 1));
            System.out.printf("%4d", mathProgress);
        }
        System.out.println();
        System.out.println("Сумма данной прогрессии");
        int mathSum = ((2 * a1 + d * (n - 1))) / 2 * n;
        System.out.println(mathSum);
        in.close();
    }
}
