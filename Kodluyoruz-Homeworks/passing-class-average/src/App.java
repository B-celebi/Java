import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double toplam = 0;
        double dersSayisi = 0;
        Scanner scn = new Scanner(System.in);

        System.out.print("Türkçe notunuz:\t");
        int turkce = scn.nextInt();

        System.out.print("Matematik notunuz:\t");
        int matematik = scn.nextInt();

        System.out.print("Fizik notunuz:\t");
        int fizik = scn.nextInt();

        System.out.print("Kimya notunuz:\t");
        int kimya = scn.nextInt();

        System.out.print("Müzik notunuz:\t");
        int muzik = scn.nextInt();
        scn.close();

        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            dersSayisi++;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }
        toplam = toplam / dersSayisi;
        if (toplam >= 55) {
            System.out.println("Dersi geçtiniz. Ortalamanız: " + toplam);
        } else {
            System.out.println("Kaldınız. Ortalamanız: " + toplam);
        }
    }
}
