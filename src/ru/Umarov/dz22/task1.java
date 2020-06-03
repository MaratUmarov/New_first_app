package ru.Umarov.dz22;

import ru.Umarov.dz22.Person.PersonSuperComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
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

    static class PersonSuperComparator implements Comparator<Person> {
        static Comparator<Person> comparator = Comparator.comparing(person -> person.getName());

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }
}

abstract class SortedbyAge implements Comparator<Person> {
    static Comparator<Person> ageComare = Comparator.comparing(person -> person.getAge());
}

public class task1 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rita", 25));
        personList.add(new Person("Vadik", 16));
        personList.add(new Person("Robert", 65));
        personList.add(new Person("Alla", 30));
        personList.add(new Person("Givi", 46));
        personList.sort(PersonSuperComparator.comparator);
        for (Person per : personList) {
            System.out.printf("%-10s%-10s\n", per.getName(), per.getAge());
        }
        for (int i = 0; i < 25; i++)
            System.out.print("=");
        System.out.println();
        personList.sort(SortedbyAge.ageComare);
        for (Person per : personList) {
            System.out.printf("%-10s%-10s\n", per.getName(), per.getAge());
        }
    }
}
