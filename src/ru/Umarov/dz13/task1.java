package ru.Umarov.dz13;

import java.lang.Exception;
import java.util.Arrays;
import java.util.Scanner;

class EatException extends Exception {
    public void EatExсeption() {
        String doNotLike = "Не буду это есть";
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
    public void childAnswer() {
        String st = "Spasibo mamochka ochen vkusno";
        System.out.println(st);
    }

    public void Eat(String feedChild) throws EatException {
        if (feedChild.equals("kasha") || feedChild.equals("shashlik") || feedChild.equals("yabloko")) {
            System.out.println("Syel za obe cheki");
        } else {
            throw new EatException();
        }
    }
}

public class task1 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(Arrays.toString(Food.values()));
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose food for the Child from current List");
        String feedChild = scan.nextLine();
        try {
            child.Eat(feedChild);
        } catch (Exception ex) {
        }
        child.childAnswer();
    }
}






