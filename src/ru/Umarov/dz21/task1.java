package ru.Umarov.dz21;

public class task1 {
    public static void toLeft(int[][] m, int steps) {
        for (int i = 0; i < m.length; i++) {
            int trueSteps = steps % m[i].length;
            while (trueSteps-- > 0) {
                int temp = m[i][0];
                for (int j = m[i].length - 1; j >= 0; j--) {
                    int val = m[i][j];
                    m[i][j] = temp;
                    temp = val;
                    int exchange = m[i].length - 1;
                    m[i][exchange] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] m) {
        for (int[] s : m) {
            for (int k : s) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        printMatrix(m);
        toLeft(m, 1);
        System.out.println();
        printMatrix(m);
    }
}
