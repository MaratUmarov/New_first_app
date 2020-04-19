package ru.Umarov.dz8;

import java.util.Scanner;

interface Print {

    static String print() {
        return  "Неверно. Попробуйте снова.";
    }
}

class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static double getDouble() {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println(Print.print());
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println(Print.print());
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = (num1 * num2) / 100;
                break;
            default:
                System.out.println(Print.print());
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}

public class task2 {

    public static void main(String[] args) {
        double num1 = Calculator.getDouble();
        double num2 = Calculator.getDouble();
        char operation = Calculator.getOperation();
        double result = Calculator.calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }
}