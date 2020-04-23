package ru.Umarov.dz8;

import java.util.Scanner;

class Contract {

    private static int contractNum = 0;

    static int getContractNum() {
        return contractNum;
    }

    private static void Count() {
        contractNum++;
    }

    public Contract() {
        Contract.Count();
    }
}

class Act {
    static Contract contract;
    public static int actNum = contract.getContractNum();


}

public class task4 {
    public static void main(String[] args) {
        System.out.println("We making new contract, please input some data");
        System.out.println("input Num of new contract");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean check = scanner.hasNextInt();
            if (!check) {
                System.out.println("You should write integer num");
                continue;
            }
            int contrNum = scanner.nextInt();
            for (int i = 0; i < contrNum; i++)
                new Contract();


            System.out.println(Contract.getContractNum());
            System.out.println(Act.actNum);
            break;
        }
    }
}
