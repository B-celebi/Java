import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double pi = 3.14;
        Scanner scn = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        double r = scn.nextDouble();

        System.out.print("Merkez açıyı giriniz:");
        double a = scn.nextDouble();

        scn.close();
        double sonuc = (pi * r * r * a) / 360;

        System.out.println("Dairenin alanı:\t" + sonuc);
    }
}
