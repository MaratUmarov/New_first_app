package ru.Umarov.dz9;

interface Runable {
    default void run(){
        String running="It's good for health";
    };
}

interface Swimible {
   default void swim(){
        String swiming="swimming make You strong";
    };
}

abstract class Human {
    public abstract String getAbility();

    abstract int getAge();
}

class Yougman extends Human implements Runable, Swimible {

    @Override
    public String getAbility() {
        return "can do all activities fast";
    }

    @Override
    int getAge() {
        return 21;
    }

    @Override
    public void run() {
        System.out.println("run fast");
   run();
    }

    @Override
    public void swim() {
        System.out.println("swim for long time");
    }
}
class Oldman extends Human implements Runable,Swimible{

    @Override
    public void run() {
        System.out.println("Cannot run at all");
    }

    @Override
    public void swim() {
        System.out.println("swim on short distance");
    }

    @Override
    public String getAbility() {
        return "get tied fast";
    }

    @Override
    int getAge() {
        return 65;
    }
}
public class task2 {
    public static void main(String[] args) {

    }
}
