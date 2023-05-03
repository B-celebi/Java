public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    asal = false;
            }
            if (asal == true)
                System.out.print(" " + i + " ");
        }
    }
}
