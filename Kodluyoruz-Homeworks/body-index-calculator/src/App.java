import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.print("Boyunuzu girin(metre):");
        double height = scn.nextDouble();

        System.out.print("Kilonuzu girin(kg):");
        double weight = scn.nextDouble();

        scn.close();
        double sonuc = weight / (height * height);

        System.out.println("Vücut kitle indeksiniz:\t" + sonuc);

    }
}
