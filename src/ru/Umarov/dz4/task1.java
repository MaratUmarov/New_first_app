package ru.Umarov.dz4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] arg) {

        System.out.println("Программа поиска минимального из двух чисел");
        System.out.println("Введите ваши числа");
        double a, b;
        Scanner in = new
                Scanner(System.in);
        System.out.println("число а");
        a = in.nextDouble();
        System.out.println("чило в");
        b = in.nextDouble();
        if (a < b) System.out.println("минимальным является \n" + a);
        else System.out.println("минимальным является \n" + b);
    }
}
