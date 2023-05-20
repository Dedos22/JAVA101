import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, muz = 0.95, patlican = 5.00, domates = 1.11, toplam;

        System.out.print("Armut Kaç Kilo ? : ");
        double a = input.nextDouble();
        armut=armut*a;

        System.out.print("Elma Kaç Kilo ? : ");
        double  e = input.nextDouble();
        elma=elma*e;

        System.out.print("Domates Kaç Kilo ? : ");
        double d = input.nextDouble();
        domates=domates*d;

        System.out.print("Muz Kaç Kilo ? : ");
        double m = input.nextDouble();
        muz= muz*m;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double p = input.nextDouble();
        patlican=patlican*p;

        toplam = armut+elma+muz+domates+patlican;
        System.out.println("Toplam Tutar : " + toplam);
    }
}
