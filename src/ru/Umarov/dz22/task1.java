package ru.Umarov.dz22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person<comparator> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
    class PersonSuperComparator {
        public static Comparator<Person> comparator = Comparator.comparing(person -> person.getName());
        public static Comparator<Person> comparator2parameter = comparator.thenComparing(person -> person.getAge());
    }

public class task1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rita", 25));
        personList.add(new Person("Vadik", 16));
        personList.add(new Person("Robert", 65));
        personList.add(new Person("Alla", 30));
        personList.add(new Person("Givi", 46));
        personList.sort(PersonSuperComparator.comparator2parameter);
        for (Person per : personList) {
            System.out.printf("%-10s%-10s\n", per.getName(), per.getAge());
        }
        for (int i = 0; i < 25; i++)
            System.out.print("=");
        System.out.println();
    }
}
