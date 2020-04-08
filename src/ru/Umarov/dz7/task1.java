package ru.Umarov.dz7;

import java.util.Scanner;

enum Drinks {
    COKE("1. cost=50 RUB"),
    FANTA("2. cost=50 RUB"),
    ORANGE_JUICE("3. cost=60 RUB "),
    PEACH_JUICE("4. cost=70 RUB"),
    GREEN_TEA("5. cost=40 RUB"),
    BLACK_TEA("6. cost=30 RUB");

    public final String s;

    Drinks(String s) {
        this.s = s;
    }
}

public class task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (Drinks dr : Drinks.values()) {
            System.out.println(dr + "  " + dr.s);
        }
        while (true) {
            System.out.println("Put Your money\n");
            boolean f = scan.hasNextInt();
            if (!f) {
                System.out.println("You Should put money , no letters");
               continue;
                //break;
            }
            int money = scan.nextInt();

            if (money < 30) {
                System.out.println("Your money not enough, Please try again our break");
                continue;
            }

        String cha = "Don't forget Your change please";
        System.out.println("Please choose Your Drink");
        while (true) {
            int choice = scan.nextInt();
            int change;
            switch (choice) {
                case 1:
                    System.out.println(Drinks.COKE + " " + Drinks.COKE.s);
                    if (money > 50) {
                        change = money - 50;
                        System.out.println(cha + "\n" + change);
                    }
                    if (money < 50) {
                        System.out.println("Your money not enough, Please try again our break");
                        continue;
                    }
                    break;
                case 2:
                    System.out.println(Drinks.FANTA + " " + Drinks.FANTA.s);
                    if (money > 50) {
                        change = money - 50;
                        System.out.println(cha + "\n" + change);
                    }
                    if (money < 50) {
                        System.out.println("Your money not enough, Please try again our break");
                        continue;
                    }
                    break;
                case 3:
                    System.out.println(Drinks.ORANGE_JUICE + " " + Drinks.ORANGE_JUICE.s);
                    if (money > 60) {
                        change = money - 60;
                        System.out.println(cha + "\n" + change);
                    }
                    if (money < 60) {
                        System.out.println("Your money not enough, Please try again our break");
                        continue;
                    }
                    break;
                case 4:
                    System.out.println(Drinks.PEACH_JUICE + " " + Drinks.PEACH_JUICE.s);
                    if (money > 70) {
                        change = money - 70;
                        System.out.println(cha + "\n" + change);
                    }
                    if (money < 70) {
                        System.out.println("Your money not enough, Please try again our break");
                        continue;
                    }
                    break;
                case 5:
                    System.out.println(Drinks.GREEN_TEA + " " + Drinks.GREEN_TEA.s);
                    if (money > 40) {
                        change = money - 40;
                        System.out.println(cha + "\n" + change);
                    }
                    if (money < 40) {
                        System.out.println("Your money not enough, Please try again our break");
                        continue;
                    }
                    break;
                case 6:
                    System.out.println(Drinks.BLACK_TEA + " " + Drinks.BLACK_TEA.s);
                    if (money > 30) {
                        change = money - 30;
                        System.out.println(cha + "\n" + change);
                    }
                    break;
                default:
                    System.out.println("Your choice wrong try again");
                    continue;
            }
            break;
        }
        break;
    }
}
}