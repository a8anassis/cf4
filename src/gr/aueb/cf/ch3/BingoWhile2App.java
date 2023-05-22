package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Do-while-break
 */
public class BingoWhile2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int num = 0;
        boolean isFound = false;

        while (true) {
            System.out.println("Please guess the key");
            num = in.nextInt();
            if (num == KEY) {
                System.out.println("Key found");
                break;
            } else {
                System.out.println("Please try again");
            }
        }

        System.out.println("Thanks for using KEY finder");
    }
}
