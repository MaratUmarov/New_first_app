package ru.Umarov.dz11;

public class task1 {
    public static void main(String[] args) {
        String str = "бяка";
        String change = str.replaceAll("бяка", "вырезано цензурой");
        System.out.println("str=" + str + "\n" + "change=" + change);
    }
}
