import java.lang.Math;

public class Ring {
    Boxer b1;
    Boxer b2;
    int minWeight = 74;
    int maxWeight = 86;
    int roundSayisi = 1;

    Ring(Boxer b1, Boxer b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    void fight() {
        if (isCheckWeight(b1, b2)) {
            int yaziTura = (int) Math.round(Math.random()); // Dovuse kimin baslayacagini secmek icin yazi tura
                                                            // atıyoruz.
            Boxer ilkBaslayan = yaziTura == 0 ? b1 : b2; // Kimin baslayacagini seciyoruz.
            Boxer ikinci = yaziTura == 0 ? b2 : b1; // Diger dovuscu bize lazım olacak.

            // Ilk round'u elle yaziyoruz. (Gorsellik acisindan)
            System.out.println("\n" + "======= Dovus basladi =======" + "\n");
            System.out.println("====== Round " + roundSayisi++ + " ======");
            System.out.println(ilkBaslayan.name + " once saldiriyor! ");
            ilkBaslayan.dealDamage(ikinci);
            System.out.println(ikinci.name + "'in cani " + ikinci.health + "'e dustu." + "\n");

            // Artik sirayla saldirilacak bir donguye girebiliriz.
            while (ilkBaslayan.health > 0 && ikinci.health > 0) {
                printRound();
                System.out.println(ikinci.name + " saldiriyor...");
                ikinci.dealDamage(ilkBaslayan);
                printScore();
                printRound();
                System.out.println(ilkBaslayan.name + " saldiriyor...");
                ilkBaslayan.dealDamage(ikinci);
                printScore();
            }
            // Kazanani ekrana yazdiriyoruz.
            printWinner(ilkBaslayan, ikinci);
        } else {
            System.out.println("Sikletler uyusmuyor.");
        }
    }

    void printWinner(Boxer ilkBaslayan, Boxer ikinci) {
        String kazanan = ilkBaslayan.health > 0 ? ilkBaslayan.name : ikinci.name;
        System.out.print(kazanan + " kazandi.");
    }

    void printScore() {
        System.out.println(b1.name + " kalan can : " + b1.health);
        System.out.println(b2.name + " kalan can : " + b2.health + "\n");
    }

    void printRound() {
        System.out.println("====== Round " + roundSayisi++ + " ======");
    }

    boolean isCheckWeight(Boxer b1, Boxer b2) {
        return (b1.weight >= minWeight && b1.weight <= maxWeight) && (b2.weight >= minWeight && b2.weight <= maxWeight);
    }
}
