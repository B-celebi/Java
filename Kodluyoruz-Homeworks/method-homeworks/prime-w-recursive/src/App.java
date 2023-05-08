import java.util.Scanner;

public class App {
    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        return isPrime(a, a - 1);
    }

    static boolean isPrime(int a, int b) {
        if (b == 1)
            return true;
        if (a % b == 0)
            return false;
        return isPrime(a, b - 1);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz sayı: ");
        System.out.println(isPrime(scn.nextInt()));
        scn.close();
    }
}
