package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Boolean Expressions. Αποφασίζει αν χιονίζει
 * με βάση όχι μόνο τη θερμοκρασία, αλλά κα το
 * αν βρέχει. Αν βρέχει και η θερμοκρασία είναι
 * < 0, τότε χιονίζει, αλλιώς όχι
 */
public class BoolApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert if is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();

        isSnowing = isRaining && temp < 0;

        System.out.println("Is snowing: " + isSnowing);
    }
}
