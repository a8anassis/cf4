package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Fahrenheit to Celsius Converter.
 * @author a8ana
 */
public class FahrenheitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please insert temp in fahrenheit");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u00B0 fahrenheit = %d\u00B0 celsius", fahrenheit, celsius);
    }
}
