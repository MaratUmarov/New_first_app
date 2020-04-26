package ru.Umarov.dz8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Data {

    String dsf;

    public String dataDate() {
        LocalDate localDate = LocalDate.now();
        dsf = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);
        return dsf;
    }
}

class Contract {

    public static int getContractNum(int contrNum) {
        return contrNum;
    }
    public static String getProduct(String product){
        return product;
    }
}

class Act {

    private static int contrNum;

    public static int getContractNum(int contrNum) {
        Act.contrNum = contrNum;
        return contrNum;
    }
    private static String product;
    public static String getProduct(String product){
        Act.product=product;
        return product;
    }
}

public class task4 {

    public static void main(String[] args) {

        Data dsf = new Data();
               System.out.println("Please input Num of Contract and Name of Product");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean check = scanner.hasNextInt();
            if (!check) {
                System.out.println("You should write integer num");
                continue;
            }
            int contrNum = scanner.nextInt();
            var product=scanner.nextLine();

            System.out.println(" номер контракта : " + Contract.getContractNum(contrNum) + "  " + dsf.dataDate()
                    +"  "+Contract.getProduct(product));
            System.out.println("номер полученного акта: " + Act.getContractNum(contrNum) + "  " + dsf.dataDate()
                    +"  "+Act.getProduct(product));

            break;
        }
    }
}
