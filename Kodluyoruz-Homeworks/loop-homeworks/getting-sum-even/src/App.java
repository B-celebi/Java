import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * We are writing a program that accepts inputs from the user until a single
         * number
         * is entered with Java loops, and then adds the numbers that are even
         * and multiples of 4 from the entered values and prints them on the screen.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int input = scn.nextInt(), sum = 0;
        while (!(input % 2 == 1)) {
            sum += input;
            System.out.println("Bir sayı daha giriniz:");
            input = scn.nextInt();
        }
        System.out.println("Toplam: " + sum);
    }
}
