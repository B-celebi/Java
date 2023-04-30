import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("İki sayıyı da girin önce taban sonra üs: ");
        int i = scn.nextInt(), j = scn.nextInt();
        int sum = 1;
        for (int k = 1; k <= j; k++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
