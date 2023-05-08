import java.util.Scanner;

public class App {

    static void pattern(int n, int yedek) {
        if (n <= 0) {
            reversePattern(n, yedek, false);
            return;
        }
        System.out.print(n + " ");
        pattern(n - 5, yedek);
    }

    static void reversePattern(int n, int yedek, boolean durum) {
        if (n > yedek)
            durum = true;
        if (durum == true)
            return;
        System.out.print(n + " ");
        reversePattern(n + 5, yedek, durum);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = scn.nextInt();
        int yedek = n;
        scn.close();
        System.out.print("Sonuç: ");
        pattern(n, yedek);
    }
}
