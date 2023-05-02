import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int giris = scn.nextInt();

        for (int i = 0; i <= giris; i++) {
            for (int j = 0; j < (giris - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= giris; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (2 * (giris - i)) + 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * 2.çözüm
         * for (int boslukSayisi = scn.nextInt(), yedek = boslukSayisi, i = 1;
         * boslukSayisi > 0; boslukSayisi--, i += 2) {
         * for (int j = boslukSayisi; j > 0; j--) {
         * System.out.print(" ");
         * }
         * for (int k = i; k > 0; k--) {
         * System.out.print("*");
         * }
         * System.out.println();
         * if (boslukSayisi == 1) {
         * for (int bosluk = boslukSayisi, k = i - 2; bosluk <= yedek; bosluk++, k -= 2)
         * {
         * for (int j = 0; j <= bosluk; j++) {
         * System.out.print(" ");
         * }
         * for (int z = k; z > 0; z--) {
         * System.out.print("*");
         * }
         * System.out.println();
         * if (bosluk == yedek)
         * break;
         * }
         * }
         * }
         */
        scn.close();
    }
}
