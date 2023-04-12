import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
         * puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan
         * programı yazın.
         * 
         * Ödev
         * Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
         * ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı"
         * yazsın.
         * 
         * Not : If ve Else kullanılmayacak...
         */
        Scanner reader = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        int matematik = reader.nextInt();

        System.out.print("Fizik notunuz: ");
        int fizik = reader.nextInt();

        System.out.print("Kimya notunuz: ");
        int kimya = reader.nextInt();

        System.out.print("Türkçe notunuz: ");
        int turkce = reader.nextInt();

        System.out.print("Tarih notunuz: ");
        int tarih = reader.nextInt();

        System.out.print("Müzik notunuz: ");
        int muzik = reader.nextInt();

        reader.close();
        float average = (muzik + turkce + tarih + kimya + fizik + matematik) / 6f;

        String sonuc = average > 60 ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println(sonuc);
    }

}
