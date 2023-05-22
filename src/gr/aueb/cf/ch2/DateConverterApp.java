package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts from dd/MM/yyy to dd mm yy
 */
public class DateConverterApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please insert day, month, year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("%02d/%02d/%2d", day, month, year);
    }
}
