import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double armut, elma, domates, muz, patlican;
        Scanner scn = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        armut = scn.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        elma = scn.nextDouble();

        System.out.print("Domates kaç kilo ? :");
        domates = scn.nextDouble();

        System.out.print("Muz kaç kilo ? :");
        muz = scn.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        patlican = scn.nextDouble();
        scn.close();

        double sonuc;
        sonuc = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.00;
        System.out.println("Toplam Tutar : " + sonuc);
    }
}
