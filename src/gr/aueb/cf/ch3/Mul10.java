package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το γινόμενο των 10 πρώτων
 * ακεραίων.
 */
public class Mul10 {

    public static void main(String[] args) {
        // το 1 είναι το ουδέτερο στοιχείο του πολ/μού
        int result = 1;
        int i = 1;

        while (i <= 10) {
            result = result * i;    // ή result *= i;
            i++;
        }

        System.out.println("Result = " + result);
    }
}
