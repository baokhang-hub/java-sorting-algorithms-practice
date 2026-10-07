package bubblesort;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        int countSosanh = 0;
        int countDoicho = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                countSosanh++;
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    countDoicho++;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("So lan so sanh la: " + countSosanh);
        System.out.println("So lan doi cho la: " + countDoicho);
    }

    static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {8, 2, 1, 4, 9, 5, 6};

        System.out.println("Mang da sap xep truoc:");
        bubbleSort(a);
        System.out.println("Mang chua sap xep truoc:");
        bubbleSort(b);
    }
}
