package ru.Umarov.dz8;

import java.util.Scanner;

class CountObjects {
    private static int countobjects = 0;

    static int getCountobjects() {
        return countobjects;
    }

    private static void Count() {
        countobjects++;
    }

    public CountObjects() {
        CountObjects.Count();
    }
}

public class task3 {
    public static void main(String[] args) {
        System.out.println("Before making new objects in class CountObjects was " + CountObjects.getCountobjects());
        System.out.println("How many objects of class CountObjects Do You want create ?");

        while (true) {
            //int obj = scan.nextInt();
            Scanner scan = new Scanner(System.in);
            boolean check = scan.hasNextInt();
            if (!check) {
                System.out.println("You should write integer num");
                continue;
            }
            int obj = scan.nextInt();
            for (int i = 0; i < obj; i++) {
                new CountObjects();
                System.out.println("After making some new objects count " + CountObjects.getCountobjects());
            }
            break;
        }
    }
}
