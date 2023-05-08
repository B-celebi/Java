import java.util.Scanner;

public class App {

    static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Taban sayıyı girin: ");
        int a = scn.nextInt();
        System.out.println("Üssü girin: ");
        int b = scn.nextInt();

        scn.close();
        System.out.println("Sonuç: " + power(a, b));
    }
}
