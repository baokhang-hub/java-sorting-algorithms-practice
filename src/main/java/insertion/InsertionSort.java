package insertion;
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] a) {

        int countSoSanh = 0;
        int countDichChuyen = 0;

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {

                countSoSanh++;

                a[j + 1] = a[j];
                countDichChuyen++;

                j--;
            }

            if (j >= 0) {
                countSoSanh++;
            }

            a[j + 1] = key;
        }

        System.out.println("So lan so sanh: " + countSoSanh);
        System.out.println("So lan dich chuyen: " + countDichChuyen);
    }

    static void main(String[] args) {

        int[] a = {5, 3, 8, 1, 2};

        System.out.println("Mang ban dau: " + Arrays.toString(a));

        insertionSort(a);

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(a));
    }
}