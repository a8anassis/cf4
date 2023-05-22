package gr.aueb.cf.ch1;

import java.util.Locale;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων.
 */
public class SumApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση
        int num1 = 1900;
        int num2 = 3000;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf(Locale.US, "%,d + %,d = %,08d", num1, num2, result);
    }
}
