import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Dizi uzunlugu ne olsun ? ");
        int a = scn.nextInt();
        int[] list = new int[a];
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + 1 + ". Elemani giriniz : ");
            list[i] = scn.nextInt();
        }
        scn.close();
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}
