package ru.Umarov.dz1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner in = new
                Scanner(System.in);
        System.out.println("Input  price of gasoline: ");
          double price = in.nextDouble();
        System.out.println("Input  quantity of gasoline: ");
          int quantity = in.nextInt();
        in.close();
          double purchase = price*quantity;
        System.out.println("You should pay \n "+purchase);
    }
}
