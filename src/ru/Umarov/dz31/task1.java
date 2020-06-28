package ru.Umarov.dz31;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String input, reverse = "";

        Scanner scan = new Scanner(System.in);

        int stringLen;
        System.out.println("проверка числа или слова на палиндром");
        System.out.println("Введите число или строку");

        input = scan.nextLine();
        // первый метод
        stringLen = input.length();
        for (int x = stringLen - 1; x >= 0; x--) {
            reverse = reverse + input.charAt(x);
        }
        System.out.println("то же в обратном направлении: " + reverse);
        System.out.println(input.equals(reverse) ? "Это палиндромом" : "Введенное значение не является палиндромом");
    // второй метод
        System.out.println( "Результат из второго метода : "+isPalindrome(input));
    }
    public static Boolean isPalindrome(String s) {
               return  s.equals((new StringBuilder(s)).reverse().toString());

    }
}

