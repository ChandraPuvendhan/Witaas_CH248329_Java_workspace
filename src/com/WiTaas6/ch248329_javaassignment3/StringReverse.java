//JAVA program to reverse the given String without using reverse().

package com.WiTaas6.ch248329_javaassignment3;


import java.util.Scanner;
public class StringReverse {
        public static void main(String args[])
        {
            String s;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String: ");
            s=sc.nextLine();                    //reading string from user
            System.out.print("After reverse string is: ");
            for(int i=s.length();i>0;--i)                //i is the length of the string
            {
                System.out.print(s.charAt(i-1));            //printing the character at index i-1
            }
        }
    }
