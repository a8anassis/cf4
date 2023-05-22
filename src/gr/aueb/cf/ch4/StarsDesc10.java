package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 αστεράκια στη 1η σειρά,
 * 9 αστεράκια στη 2η σειρά, μέχρι 1
 * αστεράκι στν 10η σειρά.
 */
public class StarsDesc10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
