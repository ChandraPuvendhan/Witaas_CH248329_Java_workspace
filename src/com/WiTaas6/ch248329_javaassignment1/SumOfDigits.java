/**
 * Java program and compute the sum of the digits of an integer.
 * Input Data:
 * Input an integer: 25
 * Expected Output
 * The sum of the digits is: 7
 */

package com.WiTaas6.ch248329_javaassignment1;


import java.util.Scanner;
public class SumOfDigits {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int digits = in.nextInt();
            System.out.println("The sum of the digits is " + sumDigits(digits));
        }

        public static int sumDigits(long n) {
            int result = 0;

            while(n > 0) {
                result += n % 10;
                n /= 10;
            }

            return result;
        }

    }

