package ru.Umarov.dz21;

import java.util.Scanner;

public class task2 {
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.println();
    }

    static void reversArray(int[] arr) {
        int temp;
        for (int i = arr.length - 1, j = 0; i >= arr.length / 2; i--, j++) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
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
        reversArray(a);
        print(a);
    }
}

