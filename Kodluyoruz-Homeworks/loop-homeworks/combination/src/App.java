import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("n ve r değerini giriniz");
        int n = scn.nextInt(), r = scn.nextInt();
        int nf = 1, rf = 1, nrf = 1;
        // C(n,r) = n! / (r! * (n-r)!)
        for (int i = 1; i <= n; i++) {
            nf *= i;
        }
        for (int i = 1; i <= r; i++) {
            rf *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nrf *= i;
        }
        ;
        System.out.println(nf = nf / (rf * nrf));
    }
}
