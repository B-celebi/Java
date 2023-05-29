import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int girilen = scn.nextInt();
        scn.close();
        int[] list = new int[] { 55, 89, 23, 44, 103, 2, -50 };
        int kucukYakin = list[3];
        int buyukYakin = list[5];
        for (int i : list) {
            if (girilen - i > 0) {
                if (Math.abs((girilen - i)) < Math.abs((girilen - kucukYakin))) {
                    kucukYakin = i;
                }
            }
            if (i - girilen > 0) {
                if (Math.abs((i - girilen)) < Math.abs((i - buyukYakin))) {
                    buyukYakin = i;
                }
            }
        }
        System.out.println("Kucuk Yakin : " + kucukYakin + "\nBuyuk Yakin : " + buyukYakin);
    }
}
