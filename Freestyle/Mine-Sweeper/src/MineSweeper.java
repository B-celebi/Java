import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int zorlukSeviyesi;
    String[][] mayinTarlasi;
    String[][] mayinlar;

    MineSweeper(int zorlukSeviyesi) {
        this.zorlukSeviyesi = zorlukSeviyesi;
    }

    // Arrayin icerisini tamamen bilinmeyenlerle doldurmak için yazdigimiz metod.
    public String[][] create(String[][] arr) {
        for (String[] row : arr) {
            Arrays.fill(row, "-");
        }
        return arr;
    }

    // Arrayimizi mayınlamak icin yazdigimiz metod
    public void mayinla(String[][] arr) {
        int counter = 0;
        while (counter < (arr.length * arr[0].length) / 4) {
            Random rnd = new Random();
            int rndRow = rnd.nextInt(arr.length);
            int rndCol = rnd.nextInt(arr[rndRow].length);
            if (mayinlar[rndRow][rndCol] == "-") {
                mayinlar[rndRow][rndCol] = "*";
                counter++;
            }
        }
    }

    // Ekrana bastirmayi cok fazla yapacagimiz icin bunu da bir metoda bagliyoruz.
    public void show(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Tum yuk start'a kalmasin hem de okunabilirlik artsin diye starttan ayri
    // bir metod.
    public void run() {
        Scanner scn = new Scanner(System.in);

        while (true) {
            show(mayinTarlasi);
            // Yedegi gondermemizin sebebi gorunmez yildizlari yedegin tutuyor olmasi.
            // Yedekte "-" degeri kalmazsa oyunu kazanirsiniz.
            if (hasWon(this.mayinlar) == true) {
                System.out.println("Oyunu Kazandiniz. Tebrikler !");
                System.exit(0);
            }
            int sayac = 0;
            System.out.print("Satir indisini giriniz : ");
            int a = scn.nextInt();
            System.out.print("Sutun indisini giriniz : ");
            int b = scn.nextInt();
            // inputlari arraye uyarliyoruz(Arraysler 0'dan basladigi icin)
            a = a - 1;
            b = b - 1;
            // Secilen noktanin uygunlugunu hesapliyoruz.
            if (a < 0 || b < 0 || a >= mayinTarlasi.length || b >= mayinTarlasi.length) {
                System.out.println("Yanlis bir tuslama yaptiniz. Tekrar Deneyin...");
                continue;
            } else {
                // Secilen noktada mayin var ise programi sonlandiriyoruz.
                if (mayinlar[a][b] == "*") {
                    System.out.println("Mayin Patladi. Oyun Sonlandiriliyor...");
                    break;
                } else {
                    // Secilen nokta bossa algoritmamizi calistiriyoruz.
                    sayac = countMines(a, b);
                }
                // Kac deger var ise hem mayinlara(yedege) hem de mayinTarlasi'na yazdiriyoruz
                this.mayinTarlasi[a][b] = String.valueOf(sayac);
                this.mayinlar[a][b] = String.valueOf(sayac);
            }

        }

        scn.close();
    }

    // Icerikte "-" degeri olup olmadigini kontrol eden algoritma. Program akisinde
    // parametresi yedek mayin tarlasi olan "mayinlar" olarak veriliyor.
    public boolean hasWon(String[][] arr) {
        for (String[] row : arr) {
            for (String col : row) {
                if (col == "-")
                    return false;
            }
        }
        return true;
    }

    /*
     * Programin asil olayi. Girilen indisin bir birimlik otesinde herhangi bir
     * yildz var ise
     * count degerini bir attiran. Ancak bundan once girilen indisin array sinirlari
     * icerisinde
     * olup olmadigini kontrol ederek hata almadan(Arrays.indexOutOfBoundsException)
     * donguye sokan
     * algoritma.
     */
    public int countMines(int row, int col) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < mayinTarlasi.length && j >= 0 && j < mayinTarlasi[i].length) {
                    if (mayinlar[i][j] == "*") {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Zorluk seviyesine gore programi baslatan program. Kisaca programin nasil
    // isledigini de gosteriyor.
    public void start() {
        if (zorlukSeviyesi == 1) {
            // Zorluk seviyesine gore bir tarla uretiyoruz.
            String[][] mayinTarlasi = new String[3][3];
            // Kullanicinin gormeyecegi yedek bir mayin tarlasi. Mayinlari burada tutacagiz.
            this.mayinlar = new String[mayinTarlasi.length][mayinTarlasi[0].length];

            this.mayinTarlasi = mayinTarlasi;

            // Bir mayin tarlasi yaratiyoruz tum degerleri "-" olan.
            mayinTarlasi = create(mayinTarlasi);
            mayinlar = create(mayinlar);
            // Mayin tarlamizi mayinliyoruz.
            mayinla(mayinlar);
            // Kullaniciya gosteriyoruz.
            show(mayinlar);
            System.out.println("===================");
            // Dongu. Daha fazlası icin ust tarafta acikladigim run() metoduna bakiniz.
            run();

            // Zorluk seviyesi 1 ile ayni islemler. Yalnizca tarla boyutu farkli.
        } else if (zorlukSeviyesi == 2) {

            String[][] mayinTarlasi = new String[6][6];
            this.mayinlar = new String[mayinTarlasi.length][mayinTarlasi[0].length];

            this.mayinTarlasi = mayinTarlasi;

            mayinTarlasi = create(mayinTarlasi);
            mayinlar = create(mayinlar);
            mayinla(mayinlar);
            show(mayinlar);
            System.out.println("===================");
            run();

            // Tarla boyutu en zor olan zorluk seviyemiz. Tum algoritma aynidir.
        } else if (zorlukSeviyesi == 3) {

            String[][] mayinTarlasi = new String[9][9];
            this.mayinlar = new String[mayinTarlasi.length][mayinTarlasi[0].length];

            this.mayinTarlasi = mayinTarlasi;

            mayinTarlasi = create(mayinTarlasi);
            mayinlar = create(mayinlar);
            mayinla(mayinlar);
            show(mayinlar);
            System.out.println("===================");
            run();

        }
    }

}
