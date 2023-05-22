package gr.aueb.cf.ch6;

/**
 * Sorts an array with bubble-sort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 7, 2, 8, 9, 1};

        for (int i = arr.length - 1; i > 0; i --) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
