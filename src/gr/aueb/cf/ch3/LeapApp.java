package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένας έτος είναι δίσεκτο αν διαιρείται με το 4.
 * Αν δε διαιρείται με το 4 δεν είναι δίσεκτο,
 * εκτός αν διαιρείται με το 100 και το 400
 */
public class LeapApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert year (int)");
        year = in.nextInt();

        if (year % 4 == 0) {
          if (year % 100 == 0) {
              if (year % 400 == 0) {
                  isLeap = true;
              }
          } else {
              isLeap = true;
          }
        }

//        isLeap = (year % 4 == 0) && !((year % 100 == 0) && (year % 400 != 0));

        System.out.printf("Το %d%s είναι δίσεκτο", year, isLeap ? "" : " δεν");
    }
}
