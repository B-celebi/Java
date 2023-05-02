import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz: ");
        int a = scn.nextInt();
        int toplam = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                toplam += i;
        }
        String durum = toplam == a ? "Mükemmel sayı buldunuz." : "Girdiğiniz sayı mükemmel sayı değil";
        System.out.println(durum);
    }
}
