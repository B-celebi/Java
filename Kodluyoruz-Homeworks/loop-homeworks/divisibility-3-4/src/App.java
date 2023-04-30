import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");

        int input = scn.nextInt();
        scn.close();
        int sum = 0, counter = 0;

        for (int i = 0; i <= input; ++i) {
            if (i == 0) // Döngüyü 0'dan başlatmamız istendiği için continue kullanıyoruz.
                continue;
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter += 1;
            }
        }
        sum = sum / counter;
        System.out.println("Sayıların ortalaması: " + sum);
    }
}
