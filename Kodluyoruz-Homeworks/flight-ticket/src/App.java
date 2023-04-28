import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
         * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
         * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
         * aşağıdaki indirimleri uygulayın ;
         * 
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
         * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
         * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
         * indirim uygulanır.
         */
        int km, age, type;
        double price;
        Scanner scn = new Scanner(System.in);
        System.out.print("Mesafe(KM):\t");
        km = scn.nextInt();
        System.out.print("\nYaşınız:\t");
        age = scn.nextInt();
        System.out.print("\nYolculuk tipiniz:\nYalnızca Gidiş - 1\nGidiş-Dönüş - 2\n");
        type = scn.nextInt();

        scn.close();
        if ((km <= 0) || (age <= 0) || (type < 1 || type > 2))
            System.out.println("Hatalı veri girdiniz!");
        else {
            price = km / 10;
            if (age < 12)
                price = price / 2;
            else if (age >= 12 && age < 24)
                price = price * 9 / 10;
            else if (age >= 65)
                price = price * 7 / 10;
            if (type == 2)
                price = price * 8 / 10;
            System.out.println("Bilet fiyatı: " + price);
        }

    }
}
