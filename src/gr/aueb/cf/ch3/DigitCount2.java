package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας αριθμός είναι Armstrong.
 * Δηλαδή το άθροισμα των δυνάμεων κάθε ψηφίου στη
 * δύναμη του πλήθους των ψηφίων ισούται με
 * τον αρχικό αριθμό.
 */
public class DigitCount2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int digit = 0;
        int digits = 0;
        int sum = 0;
        boolean isArmstrong = false;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            digits++;
            num = num / 10;
        } while (num != 0);

        num = inputNum;
        do {
            digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        } while (num != 0);

        System.out.println(sum);

        isArmstrong = (inputNum == sum);
        System.out.println(inputNum + " is Armstrong: " + isArmstrong);
    }
}
