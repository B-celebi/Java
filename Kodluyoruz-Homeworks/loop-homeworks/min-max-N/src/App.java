import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz?  ");
        int n = scn.nextInt();
        boolean first = true;
        int min = 0, max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz: ");
            int a = scn.nextInt();
            if (first == true) {
                min = a;
                max = a;
                first = false;
            } else {
                if (a < min)
                    min = a;
                if (a > max)
                    max = a;
            }
        }
        System.out.println("Minimum değer: " + min);
        System.out.println("Maximum değer: " + max);
    }
}
