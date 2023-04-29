import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String sonuc = "";
        Scanner scn = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int input = scn.nextInt();
        scn.close();

        input = input % 12;

        switch (input) {
            case 0:
                sonuc = "Maymun";
                break;
            case 1:
                sonuc = "Horoz";
                break;
            case 2:
                sonuc = "Köpek";
                break;
            case 3:
                sonuc = "Domuz";
                break;
            case 4:
                sonuc = "Fare";
                break;
            case 5:
                sonuc = "Öküz";
                break;
            case 6:
                sonuc = "Kaplan";
                break;
            case 7:
                sonuc = "Tavşan";
                break;
            case 8:
                sonuc = "Ejderha";
                break;
            case 9:
                sonuc = "Yılan";
                break;
            case 10:
                sonuc = "At";
                break;
            case 11:
                sonuc = "Koyun";
                break;
        }
        System.out.println(input);
        System.out.print("Çin zodyağına göre burcunuz: " + sonuc);
    }
}
