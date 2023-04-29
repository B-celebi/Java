import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int input;
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir yıl giriniz");
        input = scn.nextInt();
        scn.close();

        if (input % 4 == 0) {
            System.out.println(input + " bir artık yıldır.");
        } else {
            System.out.println(input + " artık bir yıl değildir!");
        }
    }
}
