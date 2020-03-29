package ru.Umarov.dz4;

public class task3 {
    public static void main(String[] arg) {
// Программа вывода на консоль таблицы умножения
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%6d", (k * i));// для выравнивания строк пустые места дополняются 6 пробелами
            }
            System.out.println();
        }
    }
}
