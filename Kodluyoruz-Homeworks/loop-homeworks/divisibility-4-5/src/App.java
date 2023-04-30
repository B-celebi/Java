import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int input = scn.nextInt();

        for (int j = 0, k = 0; Math.pow(4, j) < input && Math.pow(5, k) < input; j++, k++) {
            System.out.println(Math.pow(4, j) + "\n" + Math.pow(5, k));
        }
    }
}
