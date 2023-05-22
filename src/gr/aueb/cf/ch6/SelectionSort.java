package gr.aueb.cf.ch6;

/**
 * Sorts an array with selection sort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 4, 1, 2};
        int min;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            // Find sub-array min
            min = arr[i];
            minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }

            // Swap sub-array min <-> top element of
            // sub-array (arr[i])
            tmp = arr[i];
            arr[i] = min;
            arr[minPosition] = tmp;
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
