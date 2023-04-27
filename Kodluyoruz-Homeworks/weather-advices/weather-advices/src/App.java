import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava durumunu giriniz:");
        int heat = scanner.nextInt();

        scanner.close();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if ((heat >= 5) && (heat <= 15)) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if ((heat > 15) && (heat <= 25)) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
