package ru.Umarov.dz6;

import java.util.Scanner;

class Bank {
    // установочные данные
    private double l = 100000000;
    private double f = 5000000;

    public double getF() {
        return this.f;
    }

    public double getL() {
        return this.l;
    }
}

class Fiz {
    private double fondF = 100000;

    public double getFondF() {
        return fondF;
    }
}

class Law {
    private double fondL = 100000;

    public double getFondL() {

        return fondL;
    }
}

// принты чтоб не дублировать
class Printst {
    String viborl = "Вы выбрали юридическое лицо\n" + "введите сумму вашего уставного фонда\n";
    String viborf = "Вы выбрали физическое лицо\n" + "введите сумму ваших собственных средств'\n";
    String action = "мы работаем с банком, какую сумму кредита Вы хотели бы получить\n";
    String otkaz = "Извините Вам отказано, сумма превышает допустимый лимит";
    String odobreno = "Поздравляю одобренно";
    String no = "Врядли одобрят кредит,Ваших собственных средств не достаточно\n";

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

    public String getNo() {
        return no;
    }
}

public class task1 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new
                    Scanner(System.in);
            System.out.println("программа взаимодействия Банка с Физ и Юр лицом\n" +
                    "выбирете тип лица, с которым будем работать fiz or law \n");

            String type = in.nextLine();

            // Реализация принтов
            Printst print = new Printst();
            String viborf = print.getViborf();
            String viborl = print.getViborl();
            String odobreno = print.getOdobreno();
            String otkaz = print.getOtkaz();
            String action = print.getAction();
            String no = print.getNo();

            //Реализация подсчета
            Bank bank = new Bank();
            Fiz fiz = new Fiz();
            Law law = new Law();
            double fondF = fiz.getFondF();
            double fondL = law.getFondL();
            double f = bank.getF();
            double l = bank.getL();

            if (!type.equals("law")) { // выбор физ или юр лица

                System.out.println(viborf);
                double summ = in.nextDouble();
                System.out.println(fondF);
                double summwant = in.nextDouble();

                if (summ < fondF) { // условие соответствия фондов
                    System.out.println(no);
                    continue;
                }
                if (summ < summwant) {
                    System.out.println(no);
                    continue;
                }
                if (f < summwant) {   // условие банка
                    System.out.println(otkaz);
                    System.out.println();
                    continue;
                }
                System.out.println(odobreno);
                break;
            }

            System.out.println(viborl);
            double summ = in.nextDouble();
            System.out.println(action);
            double summwant = in.nextDouble();
            if (summ < fondL) {  // условие соответствия фондов
                System.out.println(no);
                continue;
            }
            if (summ < summwant) {
                System.out.println(no);
                continue;
            }
            if (l < summwant) { // условие банка
                System.out.println(otkaz);
                System.out.println();
                continue;
            }
            System.out.println(odobreno);
            System.out.println();
            break;

        }
    }
}
