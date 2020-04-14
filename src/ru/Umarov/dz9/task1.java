package ru.Umarov.dz9;

abstract class Animal {
    abstract String getName();
}

class Dog extends Animal {
    @Override
    String getName() {
        return "Sobaka";
    }
}

class Cat extends Animal {
    @Override
    public String getName() {
        return "Koshka";
    }
}

class Fish extends Animal {


    @Override
    public String getName() {
        return "Ribka";
    }
}

public class task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        System.out.println();
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(fish.getName());
    }
}
