package ru.Umarov.dz11;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите выражение");

        String str = scan.nextLine();
        String str1 = str.toLowerCase();
        String change = str1.replaceAll("бяка", "(вырезано цензурой)");
        System.out.println("str=" + str + "\n" + "change=" + change);
    }

}

