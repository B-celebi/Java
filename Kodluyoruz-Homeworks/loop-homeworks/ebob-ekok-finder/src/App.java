import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.println("Küçük olan sayıyı giriniz: ");
        int n1 = scn.nextInt();
        System.out.println("Büyük olan sayıyı giriniz: ");
        int n2 = scn.nextInt();

        // EBOB
        int ebob = 1;
        int ekok = 0;
        int i = 1;
        while (i < n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println(ebob);
        i = n1;
        while (++i < (n1 * n2)) {
            if (i % n1 == i % n2) {
                ekok = i;
                break;
            }
        }
        System.out.println("ekok:" + ekok);
        scn.close();
    }
}
