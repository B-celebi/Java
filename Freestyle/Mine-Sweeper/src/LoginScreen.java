import java.util.Scanner;

//Yalnizca LoginScreen sinifi. Kodun daha okunakli olmasi acisindan sinif olarak tasarlandi.
public class LoginScreen {

    Scanner scn = new Scanner(System.in);

    public void run() {
        // Kullanicidan zorluk seviyesini alacak ve ona gore uygulamamizi baslatacagiz.
        int zorlukSeviyesi;
        while (true) {
            System.out.println("Bir zorluk seviyesi seciniz :\n1 - Kolay(Easy)\n2 - Orta(Medium)\n3 - Zor(Hard)");
            zorlukSeviyesi = scn.nextInt();
            // Girilen input 1,2 ya da 3 ise bu gecerli bir inputtur. Dolayisiyla uygulama
            // baslatilir. Gecersiz inputlar icin bir dongu yazacagiz.
            if (zorlukSeviyesi == 1 || zorlukSeviyesi == 2 || zorlukSeviyesi == 3) {
                MineSweeper mine = new MineSweeper(zorlukSeviyesi);
                mine.start();
                break;
            } else {
                // Gecersiz tuslamalar icin de ufak bir dongu.
                while (true) {
                    System.out.println(
                            "Yanlis bir tuslama yaptiniz. Ne yapmak istiyorsunuz?\n1 - Tekrar Dene\n2 - Cikis Yap");

                    zorlukSeviyesi = scn.nextInt();
                    if (zorlukSeviyesi == 1)
                        break;
                    if (zorlukSeviyesi == 2) {
                        // Yanlis tuslama sonrasi programdan cikis yapilmak istenirse "2" degerinin
                        // girilmesi yeterli.
                        System.out.println("Program sonlandirildi. Hoscakalin :)");
                        scn.close();
                        System.exit(0);
                    }
                }
            }
        }
    }
}
