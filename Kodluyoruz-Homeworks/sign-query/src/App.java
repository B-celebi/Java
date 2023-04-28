import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int day, month;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı sayı olarak giriniz:\t");
        month = scanner.nextInt();

        System.out.println("Doğduğunuz günü sayı olarak giriniz:\t");
        day = scanner.nextInt();

        scanner.close();

        if ((day >= 1) && (day <= 31) && (month >= 1) && (month <= 12)) {
            if (month == 1) {
                if (day <= 21) {
                    System.out.println("Burcunuz oğlak.");
                } else {
                    System.out.println("Burcunuz kova.");
                }
            } else if (month == 2) {
                if (day <= 19) {
                    System.out.println("Burcunuz kova.");
                } else {
                    System.out.println("Burcunuz balık.");
                }
            } else if (month == 3) {
                if (day <= 20) {
                    System.out.println("Burcunuz balık.");
                } else {
                    System.out.println("Burcunuz koç. Adamsınız :d");
                }
            } else if (month == 4) {
                if (day <= 20) {
                    System.out.println("Burcunuz koç.");
                } else {
                    System.out.println("Burcunuz boğa.");
                }
            } else if (month == 5) {
                if (day <= 21) {
                    System.out.println("Burcunuz boğa.");
                } else {
                    System.out.println("Burcunuz ikizler.");
                }
            } else if (month == 6) {
                if (day <= 22)
                    System.out.println("Burcunuz ikizler");
                else
                    System.out.println("Burcunuz yengeç");
            } else if (month == 7) {
                if (day <= 22)
                    System.out.println("Burcunuz yengeç.");
                else
                    System.out.println("Burcunuz aslan.");
            } else if (month == 8) {
                if (day <= 22)
                    System.out.println("Burcunuz aslan.");
                else
                    System.out.println("Burcunuz başak.");
            } else if (month == 9) {
                if (day <= 22)
                    System.out.println("Burcunuz başak.");
                else
                    System.out.println("Burcunuz terazi");
            } else if (month == 10) {
                if (day <= 22)
                    System.out.println("Burcunuz terazi");
                else
                    System.out.println("Burcunuz akrep.");
            } else if (month == 11) {
                if (day <= 21)
                    System.out.println("Burcunuz akrep.");
                else
                    System.out.println("Burcunuz yay.");
            } else if (month == 12) {
                if (day <= 21)
                    System.out.println("Burcunuz yay.");
                else
                    System.out.println("Burcunuz oğlak.");
            }
        } else {
            System.out.println("Geçersiz sayı girildi. Program sonlandırıldı.");
        }
    }
}
