package ru.Umarov.dz13;

import java.util.Arrays;
import java.util.Scanner;

class EatExсeption extends Exception {
    public EatExсeption() {
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

    public void EatExсeptionAnswer() {
        String st = "Spasibo mamochka ochen vkusno";
        System.out.println(st);
    }
}

public class task1 {
    public static void main(String[] args) throws Exception {
        Child e = new Child();
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
                    throw new EatExсeption();
                default:
                    throw new IllegalStateException("Unexpected value: " + feedChild);
            }
        } catch (Exception ex) {
            e.EatExсeptionAnswer();
        }
    }
}






