package ru.Umarov.dz6;

import java.util.Scanner;

class Bank {
    private double l = 100000000;
    private double f = 10000000;

    public double getF() {
        return this.f;
    }

    public double getL() {
        return this.l;
    }
}
class Fiz extends Bank {
    public double fondF;
    public double getFondF() {
        return fondF;
    }
}
class Law extends Bank {
    public double fondL;
    public double getFondL() {
        return fondL;
    }
}
// принты чтоб не дублировать
class Printst {
    String viborl = "Вы выбрали юридическое лицо\\n\" + \"введите сумму вашего уставного фонда\\n";
    String viborf = "Вы выбрали физическое лицо\\n\" + \"введите сумму ваших собственных средств'\\n";
    String action = "мы работаем с банком, какую сумму кредита Вы хотели бы получить\n";
    String otkaz = "Извините Вам отказано";
    String odobreno = "Поздравляю одобренно";
    public String getOtkaz() {
        return otkaz;
    }
    public String getViborf() {
        return viborf;
    }
    public String getAction() {
        return action;
    }
    public String getOdobreno() {
        return odobreno;
    }
    public String getViborl() {
        return viborl;
    }
}
public class task1 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new
                    Scanner(System.in);
            System.out.println("программа взаимодействия Банка с Физ и Юр лицом\n");
            System.out.println("выбирете тип лица, с которым будем работать fiz or law \n");

            String type = in.nextLine();
            double summwantf = 0;
           double summwantl=0;

           // Реализация принтов
            Printst print = new Printst();
            String viborf=print.getViborf();
            String viborl=print.getViborl();
            String odobreno=print.getOdobreno();
            String otkaz=print.getOtkaz();
            String action=print.getAction();
//Реализация подсчета
            Bank bank = new Bank();
            double f = bank.getF();
            double l = bank.getL();
            if (!type.equals("law")) {

                System.out.println(viborf);
                double summf = in.nextDouble();
                System.out.println(action);
                summwantf = in.nextDouble();

                if (f < summwantf) {
                    System.out.println(otkaz);
                    System.out.println();
                    continue;
                }
                System.out.println(odobreno);
                break;
            }
           // отсюда пишет код дублируется почему
            System.out.println(viborl);
            double suml = in.nextDouble();
            System.out.println(action);
            summwantl = in.nextDouble();
            if (l < summwantl) {
                System.out.println(otkaz); // не выводит надпись?
                System.out.println();
                continue;
            }
            System.out.println(odobreno);// не выводит надпись?
            System.out.println();
            break;

        }
    }
}