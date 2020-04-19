package ru.Umarov.dz8;
import java.util.Scanner;
// Final реализация
final class Fin {

       public final int getA() {
        return a;
    }
    int a = 5;
}
//class Test extends Fin{

//} наследование не возможно

public class task1 {
    private static final Object PI =3.14 ;

    public static void main(String[] args)  {
       Fin a = new Fin();

        Scanner scan=new Scanner(System.in);
       int b=scan.nextInt();
   a.a=b;
       // PI++;     // не изменяемая переменная
   a.a += 1;
        System.out.println(PI);
        System.out.println(a.getA());
        System.out.println(b);
    }
}
