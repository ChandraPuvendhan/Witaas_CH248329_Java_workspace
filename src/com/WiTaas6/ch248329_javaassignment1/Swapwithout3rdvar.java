package com.WiTaas6.ch248329_javaassignment1;
import java.util.Scanner;

// Java program to swap two variables without using third variable

public class Swapwithout3rdvar {
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers to swap");
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println("Before swapping : "+first +" "+ second);

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After swapping: "+first +"  " + second);
    }
}

