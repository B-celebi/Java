import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz:");
        double a = scn.nextDouble();

        System.out.print("İkinci sayıyı giriniz:");
        double b = scn.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz\n1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        int secim = scn.nextInt();

        scn.close();
        switch (secim) {
            case 1:
                System.out.println("Toplama işlemi sonucu:\t" + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu:\t" + (a - b));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu:\t" + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Çarpma işlemi sonucu:\t" + (a / b));
                else
                    System.out.println("Bir sayı sıfıra bölünemez.");
                break;
        }
    }
}
