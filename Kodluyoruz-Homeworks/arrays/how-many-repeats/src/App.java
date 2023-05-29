public class App {
    static boolean isNew(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int[] list = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] duplicate = new int[list.length];
        int counterDup = 0;
        for (int i = 0; i < list.length; i++) {
            int counter = 0;
            if (isNew(duplicate, list[i])) {
                duplicate[counterDup++] = list[i];
                for (int j = 0; j < list.length; j++) {
                    if (i != j) {
                        if (list[i] == list[j]) {
                            ++counter;
                        }
                    }
                }

                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
        }
    }
}
