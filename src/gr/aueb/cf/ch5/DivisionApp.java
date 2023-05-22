package gr.aueb.cf.ch5;

/**
 * Διαίρεση και υπόλοιπο δεκαδικών
 */
public class DivisionApp {

    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double result = 0.0;
        double remaining = 0.0;

        result = num1 / num2;
        remaining = num1 % num2;

        System.out.printf("%.2f / %.2f = %05.2f\n", num1, num2, result);
        System.out.printf("%.2f / %.2f = %5.2f", num1, num2, remaining);
    }
}
