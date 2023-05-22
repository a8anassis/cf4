package gr.aueb.cf.ch6;

/**
 * Finds the min value and min position of an unsorted array
 */
public class ArrayMinApp {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }
        System.out.printf("Min Value: %d, Min Position: %d", minValue, minPosition + 1);
    }
}
