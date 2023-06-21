import java.util.Scanner;

public class App {

    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz kelimeyi giriniz : ");
        String abc = scn.nextLine();
        if (isPalindrome(abc)) {
            System.out.println("Girilen deger bir palindrom kelime");
        } else {
            System.out.println("Girilen deger bir palindrom degil.");
        }
        scn.close();
    }
}