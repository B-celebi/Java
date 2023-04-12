import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Gidilen km'yi giriniz:");
        double a = reader.nextDouble();
        reader.close();

        double ucret = (a * 2.20) + 10;
        String sonuc = ucret < 20 ? "20 TL" : Double.toString(ucret);
        System.out.print("Tutar:\t" + sonuc + " tl");
    }
}
