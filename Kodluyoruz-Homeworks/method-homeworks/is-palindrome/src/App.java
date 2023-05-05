import java.util.Scanner;

public class App {

    static double countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }

    }

    static boolean isPalindrome(int n) {
        double basamakSayisi = countDigits(n);
        if (basamakSayisi % 2 == 0) {
            int sonu = (int) (n % (Math.pow(10, (basamakSayisi / 2))));// son basamakları
            int basi = (int) (n / (Math.pow(10, (basamakSayisi / 2))));// ilk basamakları
            if (Integer.parseInt(new StringBuilder(String.valueOf(basi)).reverse().toString()) == sonu)
                return true;
            else {
                return false;
            }
        } else {
            int sonu = (int) (n % Math.pow(10, (int) Math.floor((basamakSayisi / 2))));
            int basi = (int) (n / Math.pow(10, Math.round(basamakSayisi / 2)));
            if (Integer.parseInt(new StringBuilder(String.valueOf(basi)).reverse().toString()) == sonu)
                return true;
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int input = scn.nextInt();
        scn.close();

        System.out.println(isPalindrome(input));
    }
}
