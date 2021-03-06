package ru.Umarov.dz9;

interface Runable {
    void runFast();

    void runSlow();

}

interface Swimible {
    void swimFast();

    void swimSlow();
}

abstract class Human implements Runable, Swimible {
    public abstract String getName();

    public abstract String getAbility();

    abstract int getAge();
}

class Youngman extends Human {

    @Override
    public String getName() {
        return "Вася";
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
    public void runFast() {
        System.out.println("run fast");
    }

    @Override
    public void runSlow() {

    }

    @Override
    public void swimFast() {
        System.out.println("swim for long time");
    }

    @Override
    public void swimSlow() {

    }
}

class Oldman extends Human {


    @Override
    public String getName() {
        return "Иван Иванович";
    }

    @Override
    public String getAbility() {
        return "get tired fast";
    }

    @Override
    int getAge() {
        return 65;
    }

    @Override
    public void runFast() {

    }

    @Override
    public void runSlow() {
        System.out.println("Cannot run at all");
    }

    @Override
    public void swimFast() {

    }

    @Override
    public void swimSlow() {
        System.out.println("swim on short distance");
    }
}

public class task2 {
    public static void main(String[] args) {
        Youngman Youngman = new Youngman();
        Oldman oldman = new Oldman();

        System.out.println(Youngman.getName());
        System.out.println(Youngman.getAbility());
        System.out.println(Youngman.getAge());
        Youngman.swimFast();
        Youngman.runFast();
        System.out.println();
        System.out.println(oldman.getName());
        System.out.println(oldman.getAbility());
        System.out.println(oldman.getAge());
        oldman.swimSlow();
        oldman.runSlow();
    }
}
