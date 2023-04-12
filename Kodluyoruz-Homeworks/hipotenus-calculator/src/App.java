import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Birinci kenar giriniz:\t");
        int ilk = reader.nextInt();

        System.out.print("İkinci kenarı giriniz:\t");
        int ikinci = reader.nextInt();

        System.out.print("Üçüncü kenarı giriniz:\t");
        int ucuncu = reader.nextInt();
        reader.close();

        double u = (ilk + ikinci + ucuncu) / 2.0;
        double alan = Math.sqrt(u * (u - ilk) * (u - ikinci) * (u - ucuncu));
        System.out.println("Üçgenin alanı:" + alan);

    }
}
