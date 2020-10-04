/**
 * Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number: 5
 * Expected Output
 * Binary number is: 101
 */

package com.WiTaas6.ch248329_javaassignment1;


    import java.util.Scanner;
    public class Decimal2Binary {
        public static void main(String args[])
        {
            int dec_num, quot, i=1, j;
            int bin_num[] = new int[100];
            Scanner scan = new Scanner(System.in);

            System.out.print("Input a Decimal Number : ");
            dec_num = scan.nextInt();

            quot = dec_num;

            while(quot != 0)
            {
                bin_num[i++] = quot%2;
                quot = quot/2;
            }

            System.out.print("Binary number is: ");
            for(j=i-1; j>0; j--)
            {
                System.out.print(bin_num[j]);
            }
            System.out.print("\n");
        }
    }


