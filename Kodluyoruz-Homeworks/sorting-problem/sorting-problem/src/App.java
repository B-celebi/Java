import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz:");
        int ilk = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int ikinci = scanner.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        int ucuncu = scanner.nextInt();

        scanner.close();

        if (ilk < ikinci && ilk < ucuncu) {
            if (ikinci < ucuncu) {
                System.out.println(ilk + "<" + ikinci + "<" + ucuncu);
            } else {
                System.out.println(ilk + "<" + ucuncu + "<" + ikinci);
            }
        } else if (ikinci < ilk && ikinci < ucuncu) {
            if (ilk < ucuncu) {
                System.out.println(ikinci + "<" + ilk + "<" + ucuncu);
            } else {
                System.out.println(ikinci + "<" + ucuncu + "<" + ilk);
            }
        } else if (ucuncu < ilk && ucuncu < ikinci) {
            if (ilk < ikinci) {
                System.out.println(ucuncu + "<" + ilk + "<" + ikinci);
            } else {
                System.out.println(ucuncu + "<" + ikinci + "<" + ilk);
            }
        }

    }
}
