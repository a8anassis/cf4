package gr.aueb.cf.ch6;

/**
 * Αντιγράφει ένα πίνακα με τη χρήση της
 * System.arraycopy(src, srcPos, dest, destPos, length)
 */
public class ArrayReplaceNextSystemClassApp {

    public static void main(String[] args) {
        int[] ages = {20, 22, 23, 24, 26};
        int[] agesCopy = new int[5];

        // Copy length - 1 elements from ages to agesCopy
        System.arraycopy(ages, 0, agesCopy, 0, ages.length - 1);

        // insert 0 as the last element of agesCopy
        // Essentially, this is not needed in this
        // case, since the default value of last
        // element is zero, from initialization
        agesCopy[agesCopy.length - 1] = 0;

        // Copies agesCopy reference to ages reference
        // Shallow copy
        ages = agesCopy;

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
