package ru.Umarov.dz25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        // {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} возвращает TRUE
        // {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} возвращает FALSE
        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");
        System.out.println(map);
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        var valueset = new HashSet<String>(map.values());
        boolean status;
        status = map.values().size() == valueset.size();
        return status;
    }
}