package ru.Umarov.dz4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("Программа вывода арифметической прогрессии" +
                "An=A1+d(n-1)\n" + "где n-кол-во членов пргрессии и d- разность прогрессии\n" +
                "надоест введите любую букву и все закончится\n");
        while (true) {
            Scanner in = new
                    Scanner(System.in);

            System.out.println("первый член вашей прогрессии a1= ");
            boolean br = in.hasNextInt(); // прерывание по требованию
            if (!br) break;
            int a1 = in.nextInt();
            System.out.print("кол-во членов вашей прогресси n= ");
            int n = in.nextInt();
            if (n <= 0) {
                System.out.println("Не верные данные");
                continue;
            }
            System.out.print("разность прогрессии d= ");
            int d = in.nextInt();
            for (int i = 1; i <= n; i++) {
                int mathProgress = (a1 + d * (i - 1));
                System.out.printf("%4d", mathProgress);
            }
            System.out.println();
            System.out.println("Сумма данной прогрессии");
           double x;// вариант защиты числителя
              x= ((2 * a1 + d * (n - 1)));
            double mathSum =  x/ 2 * n;
            System.out.println(mathSum);
        }
    }
}