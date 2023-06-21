import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        int abc = rnd.nextInt(100);
        int[] inputs = new int[5];
        int right = 0;
        System.out.println(
                "Sayi tahmin oyununa Hosgeldiniz: \n0-100 deger araliginda bir sayi tahmin etmelisiniz. Basarilar!");
        while (right < 5) {
            System.out.println("Tahmininiz: ");
            int input = scn.nextInt();
            if (input < 0 || input > 100) {
                System.out.println("Lutfen gecerli bir sayi giriniz:");
            } else {
                if (input != abc) {
                    inputs[right++] = input;
                    System.out.println("Yanlis tahmin. Kalan tahmin hakkiniz : " + (5 - right));
                } else {
                    System.out.println("Tebrikler oyunu " + right + ". tahminde kazandiniz.");
                }
            }
            if (right == 5) {
                System.out.println("Kaybettiniz. Bulmaniz gereken sayi " + abc + "'ydi.");
                System.out.print("Sizin girdiginiz degerler : " + Arrays.toString(inputs));
            }
        }
        scn.close();
    }
}
