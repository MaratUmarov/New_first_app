package ru.Umarov.dz24;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        for (String s : set) System.out.println(s);
        System.out.println("_________________");
        removeEvenLength(set);
        for (String s : set) System.out.println(s);
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(s -> s.length() % 2 == 0);
        return set;
    }
}
