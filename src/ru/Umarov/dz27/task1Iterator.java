package ru.Umarov.dz27;

public class task1Iterator {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            String s = fibonaciIterator(i) + " ";
            System.out.print(s);
        }
    }
    static int fibonaciIterator(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
}
