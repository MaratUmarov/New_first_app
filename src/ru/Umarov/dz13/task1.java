package ru.Umarov.dz13;

import java.util.Arrays;
import java.util.Scanner;

class Eat_Exсeption extends Exception {

}

enum Eda {
    LEMON(1),
    YABLOKO(2),
    KASHA(3),
    SHASHLIK(4),
    BROKOLI(5),
    KAPUSTA(6);

    int s;

    Eda(int s) {
        System.out.printf("%6d%n", s);

    }
}

class Child {

    public void Child() {
        Eat_Exсeption ex = new Eat_Exсeption();
        System.out.println(" should be - beeee but....");
        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("ochen vkusno Mamochka");
        }
    }

    public void Eat_child(int eda) {

        switch (eda) {
            case 1:
                Child();
                break;
            case 2:
                System.out.println("syel za obe scheki");

                break;
            case 3:
                System.out.println("syel za obe scheki");
                break;
            case 4:
                System.out.println("syel za obe scheki");
                break;
            case 5:
                Child();
                break;
            case 6:
                Child();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + eda);
        }

    }
}

public class task1 {
    public static void main(String[] args) {


        Child try_eat = new Child();
        System.out.println(Arrays.toString(Eda.values()));


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose food for the Child");

            boolean bl = scan.hasNextInt();

            if (!bl) {
                System.out.println("Choose from current list Names of food");
                continue;
            }
            int eda = scan.nextInt();

            try_eat.Eat_child(eda);

            break;
        }
    }
}



