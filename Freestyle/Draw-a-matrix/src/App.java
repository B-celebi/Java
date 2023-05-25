import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x, y, sayac = 0;
        Scanner scn = new Scanner(System.in);
        // getting inputs from user
        System.out.println("Satır sayısını giriniz : ");
        x = scn.nextInt();
        System.out.println("Sütün sayısını giriniz : ");
        y = scn.nextInt();

        // defining an multi-dimensional Array
        int[][] ornek = new int[x][y];
        while (sayac < ornek.length) {
            for (int i = 0; i < ornek[sayac].length; i++) {
                // asking next value for the current row from user
                System.out.println(sayac + ". satırda sıradaki sayı : ");
                ornek[sayac][i] = scn.nextInt();
            }
            sayac++;
        }
        scn.close();
        // printing the matrix
        for (int i = 0; i < ornek.length; i++) {
            for (int j = 0; j < ornek[i].length; j++) {
                System.out.print(ornek[i][j] + " ");
            }
            System.out.println();
        }
    }
}
