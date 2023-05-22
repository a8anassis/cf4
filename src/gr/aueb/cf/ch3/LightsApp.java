package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα του αυτοκινήτου,
 * με βάση τρεις μεταβλητές: αν βρέχει και ταυτόχρονα
 * ισχύει ένα τουλάχιστον από τα επόμενα, είναι σκοτάδι
 * ή τρέχουμε (speed > 100). Αυτές τις τιμές τις λαμβάνουμε
 * από τον χρήστη (πληκτρολόγιο, std input)
 */
public class LightsApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int velocity = 0;
        boolean lightsOn  = false;

        // Εντολές
        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false");
        isDark = in.nextBoolean();

        System.out.println("Please insert velocity (int)");
        velocity = in.nextInt();

        isRunning = (velocity > 100);
        lightsOn = isRaining && (isDark || isRunning);

        // Εκτύπωση αποτελεσμάτων
        System.out.println("lights on: " + lightsOn);
    }
}
