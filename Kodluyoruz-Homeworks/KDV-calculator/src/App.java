import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Tutar giriniz:\t");
        double input = okuyucu.nextInt();
        okuyucu.close();
        if (input < 0) {
            System.out.println("HATA!");
            return;
        } else if (input > 1000) {
            System.out.println("KDV'siz fiyat: " + input);
            System.out.println("KDV'li fiyat: " + (input + (input * 0.08)));
            System.out.println("KDV tutarı: 8%");
        } else {
            System.out.println("KDV'siz fiyat: " + input);
            System.out.println("KDV'li fiyat: " + (input + (input * 0.18)));
            System.out.println("KDV tutarı: 18%");
        }
    }
}
