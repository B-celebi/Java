import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz:");
        int a = scn.nextInt();
        for (int i = a; i > 0; i--) {
            for (int j = a - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
