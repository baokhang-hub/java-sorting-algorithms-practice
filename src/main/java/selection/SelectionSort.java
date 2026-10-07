package selection;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int countSoSanh = 0;
        int countDoicho = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                countSoSanh++;
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

                countDoicho++;
            }
        }
        System.out.println("So lan so sanh: " + countSoSanh);
        System.out.println("So lan doi cho: " + countDoicho);
    }

    static void main(String[] args) {
        int[] arr = {3, 1, 6, 7, 2, 4, 10, 9, 5, 8};
        selectionSort(arr);
        System.out.println("Da sap xep: " + Arrays.toString(arr));
    }
}
