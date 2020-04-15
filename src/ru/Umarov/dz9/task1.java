package ru.Umarov.dz9;

interface Run {
    void run();
}

interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

abstract class Animal {
    abstract String getName();
}

class Dog extends Animal implements Run, Swim {
    @Override
    String getName() {
        return "Sobaka";
    }

    @Override
    public void run() {
        System.out.println("run very well");
    }

    @Override
    public void swim() {
        System.out.println("can swim");
    }
}

class Cat extends Animal implements Run, Swim {

    @Override
    String getName() {
        return "Koshka";
    }

    @Override
    public void run() {
        System.out.println("run very well");
    }

    @Override
    public void swim() {
        System.out.println("can swim sometimes");
    }
}

class Bird extends Animal implements Run, Swim, Fly {

    @Override
    String getName() {
        return "Ptichka";
    }

    @Override
    public void run() {
        System.out.println("run ");
    }

    @Override
    public void swim() {
        System.out.println("can swim");
    }

    @Override
    public void fly() {
        System.out.println("fly far");
    }
}

public class task1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        System.out.println(dog.getName());
        dog.run();
        dog.swim();
        System.out.println();
        System.out.println(cat.getName());
        cat.run();
        cat.swim();
        System.out.println();
        System.out.println(bird.getName());
        bird.fly();
        bird.run();
        bird.swim();
    }
}

