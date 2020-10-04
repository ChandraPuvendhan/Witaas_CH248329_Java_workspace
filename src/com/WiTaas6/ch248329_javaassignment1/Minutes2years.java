/**
 * Java program to convert minutes into a number of years and days
 */

package com.WiTaas6.ch248329_javaassignment1;


    import java.util.Scanner;
public class Minutes2years {

        public static void main(String[] Strings) {


            double minutesInYear = 60 * 24 * 365;

            Scanner input = new Scanner(System.in);

            System.out.print("Input the number of minutes: ");

            double min = input.nextDouble();

            long years = (long) (min / minutesInYear);
            int days = (int) (min / 60 / 24) % 365;

            System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
        }
    }

