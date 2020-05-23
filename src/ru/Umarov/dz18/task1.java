package ru.Umarov.dz18;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class task1 {
    public static void main(String[] args) {

        File dir = new File("TestCode");
        File basicText = new File(dir, "basicText.txt");
        File secondText = new File(dir, "secondText.txt");
        boolean b = dir.mkdir();
        String str = "пробуем поменять кодировку";
        try {
            if (basicText.createNewFile() || secondText.createNewFile())
                System.out.println("files had been created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(basicText), StandardCharsets.UTF_8))) {
            bw.write(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(basicText)));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(secondText), Charset.forName("Windows-1251")))) {

            while (in.ready()) {
                String s = in.readLine();
                out.write(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



