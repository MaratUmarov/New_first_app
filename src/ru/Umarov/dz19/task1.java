package ru.Umarov.dz19;

import java.io.*;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class task1 {
    public static void main(String[] args) {
        String s = "products.txt";
        File file = new File(s);
        System.out.printf("%-20s%-9s%-10s%-5s%n", "наименование", "цена", "кол-во", "стоимость");
        printsymbol();
        double summ = 0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String item = sc.nextLine();
                double price = parseDouble(sc.nextLine());
                double quantity = parseDouble(sc.nextLine());
                double cost = price * quantity;
                System.out.printf("%-20s%-6s%-3s%-11s%-2s%.2f%n", item, price, "x", quantity, "=", cost);
                summ = summ + cost;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printsymbol();
        System.out.printf("%-34s%-7s%.2f", "Итого", " ", summ);
    }

    public static void printsymbol() {
        for (int i = 0; i < 48; i++)
            System.out.print("=");
        System.out.println();
    }
}


