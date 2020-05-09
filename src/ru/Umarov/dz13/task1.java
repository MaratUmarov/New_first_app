package ru.Umarov.dz13;

import java.util.Arrays;
import java.util.Scanner;

class Eat_Exсeption extends Exception {
    public Eat_Exсeption() {
    }

    public void eat_ExсeptionAnswer() {
        String st = "Spasibo mamochka ochen vkusno";
        System.out.println(st);
    }
}

enum Food {
    LEMON,
    YABLOKO,
    KASHA,
    SHASHLIK,
    BROKOLI,
    KAPUSTA;
}

class Child {
    public void Eat() {
        System.out.println("Syel za obe cheki");
    }
}

public class task1 {

    public static void main(String[] args) throws Exception {

        Eat_Exсeption e = new Eat_Exсeption();
        Child try_eat = new Child();

        System.out.println(Arrays.toString(Food.values()));
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose food for the Child from current List");

        String feedChild = scan.nextLine();
        try {
            switch (feedChild) {
                case "kasha":
                case "shashlik":
                case "yabloko":
                    try_eat.Eat();
                    break;

                case "brokoli":
                case "lemon":
                case "kapusta":
                    throw new Eat_Exсeption();

                default:
                    throw new IllegalStateException("Unexpected value: " + feedChild);
            }
        } catch (Exception ex) {
            e.eat_ExсeptionAnswer();
        }
    }
}






