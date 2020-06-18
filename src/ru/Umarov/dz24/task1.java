package ru.Umarov.dz24;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        String[] m = {"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"};
        Set<String> set = new LinkedHashSet<>();
        Collections.addAll(set, m);
        for (String s : set) System.out.println(s);
        System.out.println("_________________");
        removeEvenLength(set);
        for (String s : set) System.out.println(s);
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() % 2 == 0)
                iterator.remove();
        }
        return set;
    }
}
