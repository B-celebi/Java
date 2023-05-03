import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Fibonacci eleman sayısını giriniz: ");
        int input = scn.nextInt();
        // 0 1 1 2 3 5 8 13 21 34 55
        int toplam;
        int a = 0;
        int b = 1;
        for (int i = 0; i < input; i++) {
            if (i == 0) {
                System.out.print(a + " ");
                continue;
            }
            if (i == 1) {
                System.out.print(b + " ");
                continue;
            }
            toplam = a + b;
            a = b;
            b = toplam;
            System.out.print(b + " ");
        }
        scn.close();
    }
}
