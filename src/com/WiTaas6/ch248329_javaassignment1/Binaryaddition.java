/**
 * 3.Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output
 * Sum of two binary numbers: 101
 */
package com.WiTaas6.ch248329_javaassignment1;
import java.util.Scanner;
public class Binaryaddition {

    public static void main(String[] args)
    {

        long b1, b2;
        int i = 0, carry = 0;

        int[] sum = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        b1 = sc.nextLong();

        System.out.print("Input second binary number: ");
        b2 = sc.nextLong();

        System.out.print("Binary addition of " +b1+ " and " +b2+ " is: ");
        while (b1 != 0 || b2 != 0)
        {
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;

        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}