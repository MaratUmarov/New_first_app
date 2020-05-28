package ru.Umarov.dz21;

import java.util.Scanner;

public class task2 {
    public static void print(int[] a) {
        System.out.println("элементы массива");

        for (int i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.println();
    }

    public static void swap(int[] a, int i1, int i2) {
        int tmp = a[i1];
        a[i1] = a[i2];
        a[i2] = tmp;
    }

    public static void main(String[] args) {
        System.out.println("введите длину массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println();
        System.out.println("введите элементы массива");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        print(a);
        for (int left =0 ; left < n; left++) {
            int min = left;
            for (int i = left; i < n; i++)
                if (a[i] > a[min])
                    min = i;
            swap(a, left, min);
            print(a);
        }
    print(a);
    }
}
