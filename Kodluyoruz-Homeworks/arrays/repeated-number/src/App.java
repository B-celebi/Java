import java.util.Arrays;

public class App {
    static boolean isNew(int[] arr, int value) {
        for (int i : arr) {
            if (value == i)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int[] list = new int[] { 10, 5, 9, 3, 4, 3, 9, 5, 1, 2, 26, 26 };
        int[] duplicate = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (isNew(duplicate, list[i])) {
                for (int j = 0; j < list.length; j++) {
                    if (i == j) {
                        continue;
                    } else {
                        if (list[i] == list[j] && list[i] % 2 == 0) {
                            duplicate[counter++] = list[i];
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
