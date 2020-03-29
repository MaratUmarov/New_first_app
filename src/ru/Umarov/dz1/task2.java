package ru.Umarov.dz1;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner in = new
                Scanner(System.in);
        System.out.println("введите сумму заработной платы ");
        double z = in.nextInt();
        System.out.println("подоходный налог составляет   13 % от суммы зп   ");
        double sal = z - z * 13 / 100;
        System.out.println("зарплата до вычета подоходного налога" + "  " + z);
        System.out.println("зарплата после вычета подоходного налога" + "  " + sal);
    }
}
