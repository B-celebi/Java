import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("...Harmonik seri uygulaması...");
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int input = scn.nextInt();
        scn.close();

        double toplam = 1;
        for (double i = 1; i <= input; i++) {
            toplam += (1 / i);
        }
        System.out.println(toplam);
    }
}
