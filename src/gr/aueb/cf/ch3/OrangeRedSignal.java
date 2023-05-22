package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δύο δεξαμενές. Ο
 * πιλότος δίνει true σε μία κονσόλα, αν
 * μία δεξαμενή έχει λιγότερο από 1/4 καύσιμα
 * και τότε ανάβει ένα πορτοκαλί σήμα, ενώ αν
 * δώσει δύο true, τότε ανάβει το κόκκινο σήμα κινδύνου.
 */
public class OrangeRedSignal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean orangeOn = false;
        boolean redOn = false;
        boolean isTank1LessThanOneQuarter = false;
        boolean isTank2LessThanOneQuarter = false;

        System.out.println("Insert Tank1/Tank2 Less Than 1/4 (true/false)");
        isTank1LessThanOneQuarter = in.nextBoolean();
        isTank2LessThanOneQuarter = in.nextBoolean();

        orangeOn = isTank1LessThanOneQuarter || isTank2LessThanOneQuarter;
        redOn = isTank1LessThanOneQuarter && isTank2LessThanOneQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
