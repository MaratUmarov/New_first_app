package ru.Umarov.dz15;

import java.io.*;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

public class task1 {

    public static void main(String[] args) throws IOException {

        File myNewDir = new File("c:\\MyTryDir\\MyFirstDir");
        File myNewDir1 = new File("c:\\MyTryDir\\MyFirstDir\\12");
        File firstFile1 = new File(myNewDir, "firstFile");
        File renameDir = new File("c:\\MyTryDir\\MyFirstDir\\Nextdir");
        File firstFile = new File(myNewDir, "firstFile.jpg");
        File copyfirst = new File(renameDir, "copyfirst.jpg");


        try {
            URL u = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcROHv8ygRYprm1r7Lof07W9eX47nFX2qz-Zw6jhb4yCnheyvhec&usqp=CAU");

            InputStream is = u.openStream();
            Files.copy(is, firstFile.toPath());
        }catch (FileAlreadyExistsException e){
            System.out.println("File is already exists");
        }catch (IOException e){
            System.out.println("Something goes wrong");
        }
        boolean crdir = myNewDir.mkdir();
        boolean crdir2 = myNewDir1.mkdirs();
        // boolean crdir1 = myNewD.mkdir();
        boolean crdir3 = myNewDir1.renameTo(renameDir);
        System.out.println(crdir);
        //  System.out.println(crdir1);
        System.out.println(crdir2);
        System.out.println(renameDir);
        try {
            firstFile.createNewFile();
            firstFile1.createNewFile();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (FileAlreadyExistsException ex) {
            System.out.println("file is exist");
        }
        try {

            Files.copy(firstFile.toPath(), copyfirst.toPath());
        } catch (IOException e) {
            System.out.println("wrong parametre");
        }

        firstFile1.delete();
        boolean canwrite = firstFile1.canWrite();
        System.out.println(canwrite);
        System.out.println(firstFile1 + "  deleted");
    }
}
