package ru.Umarov.dz33;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task1 {

    public static void main(String[] args) {

        String text = "This is test message";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int cnt;
            if (map.get(ch) != null) cnt = map.get(ch);
            else cnt = 0;
            cnt++;
            map.put(ch, cnt);
        }
        int maxValue = (Collections.max(map.values()));
        for (Character key : map.keySet())
            if (maxValue == map.get(key)) {
                System.out.println("Character: " + key + " has occurred maximum times in String: " + map.get(key));
            }
    }
}
