import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String username, password;

        Scanner scn = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz:\t");
        username = scn.nextLine();

        System.out.print("Şifrenizi giriniz:\t");
        password = scn.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı");
        } else if (username.equals("patika") && !(password.equals("java123"))) {
            System.out.println("Kullanıcı bulundu, şifrenizi sıfırlamak ister misiniz?\n1- Şifre sıfırla\n2- Vazgeç");
            String secim = scn.nextLine();
            if (secim.equals("1")) {
                System.out.print("Yeni şifrenizi giriniz:");
                String son = scn.nextLine();
                if (son != password) {
                    password = son;
                    System.out.println("Yeni şifreniz başarıyla oluşturuldu:\t" + password);
                } else {
                    System.out.println("HATA! Yeni şifreniz eski şifreyle aynı olamaz.");
                }
            } else {
                System.out.println("Hoşçakalın!");
            }
        } else {
            System.out.println("Kullanıcı bulunamadı.");
        }
        scn.close();
    }
}
