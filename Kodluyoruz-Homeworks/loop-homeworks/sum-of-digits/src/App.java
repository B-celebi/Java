import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        int den = scn.nextInt(), sum = 0, hanesayisi = 0, i = 0;

        while (den / Math.pow(10, i) >= 1 || den / Math.pow(10, i) == 0) {
            hanesayisi++;
            i++;
        }
        for (int j = 0; j < hanesayisi; j++) {
            double hadi = den / Math.pow(10, j);
            hadi = Math.floor(hadi % 10);
            sum += (int) hadi;
        }

        System.out.println(sum);
    }
}
