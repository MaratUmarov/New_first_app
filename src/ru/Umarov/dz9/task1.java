package ru.Umarov.dz9;

abstract class Animal {
    abstract String getName();
}

 class Dog extends Animal implements Activity {

    @Override
    String getName() {
        return "Sobaka";
    }

    @Override
    public String getRunActivity() {
        return "Can run";
    }

     @Override
     public String getFlyActivity() {
         return null;
     }

     @Override
    public String getSwimActivity() {
        return "Can swim";
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
  interface Activity{
public  String getRunActivity();
public String getFlyActivity();
public String getSwimActivity();
}
public  class task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        System.out.println();
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(fish.getName());
        System.out.println(dog.getRunActivity()+ dog.getSwimActivity());
    }
}
