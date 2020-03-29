package ru.Umarov.dz1;

import java.util.Scanner;


public class task3 {

    public static void main(String[] args) {

        Scanner in = new
                Scanner(System.in);
        System.out.print("секунды которые надо перевести в часы: \n");
        int num = in.nextInt();
        System.out.println("секунды: " + num);
        in.close();
        float clock = (num / 3600f);
        String res = String.format("%.2f", clock);
        System.out.print("получаем часы :  "+res);
    }
}