package ru.Umarov.dz9;

interface Runable {
    default void run() {
        String running = "It's good for health";
    }

    ;
}

interface Swimible {
    default void swim() {
        String swiming = "swimming make You strong";
    }

    ;
}

abstract class Human {
    public abstract String getName();
    public abstract String getAbility();

    abstract int getAge();
}

class Yougman extends Human implements Runable, Swimible {

    @Override
    public String getName() {
        return "Yougman";
    }

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
       // run();
    }

    @Override
    public void swim() {
        System.out.println("swim for long time");
   // swim();
    }
}

class Oldman extends Human implements Runable, Swimible {

    @Override
    public void run() {
        System.out.println("Cannot run at all");
    }

    @Override
    public void swim() {
        System.out.println("swim on short distance");
    }

    @Override
    public String getName() {
        return "Oldman";
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
Yougman yougman=new Yougman();
Oldman oldman=new Oldman();

System.out.println(yougman.getName());
        System.out.println(yougman.getAbility());
        System.out.println(yougman.getAge());
        yougman.swim();
        yougman.run();
        System.out.println();
        System.out.println(oldman.getName());
        System.out.println(oldman.getAbility());
        System.out.println(oldman.getAge());
        oldman.swim();
        oldman.run();
    }
}
