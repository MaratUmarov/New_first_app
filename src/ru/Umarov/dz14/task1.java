package ru.Umarov.dz14;

import org.apache.log4j.Logger;

import java.util.Scanner;
import java.util.InputMismatchException;

import static java.lang.System.out;

enum Drinks1 {
    COKE("1. cost=50 RUB"),
    FANTA("2. cost=50 RUB"),
    ORANGE_JUICE("3. cost=60 RUB "),
    PEACH_JUICE("4. cost=70 RUB"),
    GREEN_TEA("5. cost=40 RUB"),
    BLACK_TEA("6. cost=30 RUB");
    public final String s;

    Drinks1(String s) {
        this.s = s;
    }
}

public class task1 {
    private static final Logger logger = Logger.getLogger(task1.class);
    private static Object e;

    public static void main(String[] args) throws Throwable {

        for (Drinks1 dr : Drinks1.values()) {
            out.println(dr + "  " + dr.s);
        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            out.println("Put Your money\n");
            boolean f = scan.hasNextInt();

            try {
                if (!f)
                    out.println("You Should put money , no letters");
            } catch (InputMismatchException e) {
                logger.warn("wrong type of data");

                continue;
            }
            int money = scan.nextInt();
            if (money < 30) {
                printWarnig();
                continue;
            }
            String get_change = "Don't forget Your change please";
            out.println("Please choose Your Drink");
            logger.info("making choice");
            while (true) {
                int choice = scan.nextInt();
                int change;
                switch (choice) {
                    case 1:
                        out.println(Drinks1.COKE + " " + Drinks1.COKE.s);
                        if (money > 50) {
                            change = money - 50;
                            getChange(get_change, change);
                        }
                        if (money < 50) {
                            printWarnig();
                            continue;
                        }
                        break;
                    case 2:
                        out.println(Drinks1.FANTA + " " + Drinks1.FANTA.s);
                        if (money > 50) {
                            change = money - 50;
                            getChange(get_change, change);
                        }
                        if (money < 50) {
                            printWarnig();
                            continue;
                        }
                        break;
                    case 3:
                        out.println(Drinks1.ORANGE_JUICE + " " + Drinks1.ORANGE_JUICE.s);
                        if (money > 60) {
                            change = money - 60;
                            getChange(get_change, change);
                        }
                        if (money < 60) {
                            printWarnig();
                            continue;
                        }
                        break;
                    case 4:
                        out.println(Drinks1.PEACH_JUICE + " " + Drinks1.PEACH_JUICE.s);
                        if (money > 70) {
                            change = money - 70;
                            getChange(get_change, change);
                        }
                        if (money < 70) {
                            printWarnig();
                            continue;
                        }
                        break;
                    case 5:
                        out.println(Drinks1.GREEN_TEA + " " + Drinks1.GREEN_TEA.s);
                        if (money > 40) {
                            change = money - 40;
                            getChange(get_change, change);
                        }
                        if (money < 40) {
                            printWarnig();
                            continue;
                        }
                        break;
                    case 6:
                        out.println(Drinks1.BLACK_TEA + " " + Drinks1.BLACK_TEA.s);
                        if (money > 30) {
                            change = money - 30;
                            getChange(get_change, change);
                        }
                        break;
                    default:
                        out.println("Your choice wrong try again");
                        logger.warn("wrong choice should try again");
                        continue;
                }
                break;
            }
            break;
        }
    }

    private static void printWarnig() {
        out.println("Your money not enough, Please try again our break");
        logger.info("not enough money");
    }

    private static void getChange(String get_change, int change) {
        out.println(get_change + "\n" + change);
        logger.info("get change");
    }
}