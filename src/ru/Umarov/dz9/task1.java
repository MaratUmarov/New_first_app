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

class Cat extends Animal implements Activity {
    @Override
    public String getName() {
        return "Koshka";
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
class Fish extends Animal implements Activity  {

    @Override
    public String getName() {
        return "Ribka";
    }
    @Override
    public String getRunActivity() {
        return null;
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

        System.out.println(cat.getName()+" "+cat.getRunActivity()+ " "+cat.getSwimActivity());
        System.out.println(fish.getName()+" "+fish.getSwimActivity());
        System.out.println(dog.getName()+" "+dog.getRunActivity()+ " "+dog.getSwimActivity());
    }
}
