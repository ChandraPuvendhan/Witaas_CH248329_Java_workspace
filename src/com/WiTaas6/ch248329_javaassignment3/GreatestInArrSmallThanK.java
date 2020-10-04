/**
 * 2.	Given an array A of length N and a number K, find the greatest number in the array A that is smaller than K.  
 * SAMPLE INPUT  
 * Please enter size of array and number of tests
 * 5 2 
 * Please enter array elements
 * 3 5 7 2 3 
 * Enter test1
 * 10 
 * Enter test2
 * 7 
 *       SAMPLE OUTPUT  
 *       7 
 *       5 
 * Explanation:
 * The greatest number that is smaller than 10 is 7. 
 * The greatest number that is smaller than 7 is 5.  
 */

package com.WiTaas6.ch248329_javaassignment3;


// Java code for kth smallest element
// in an array
import java.util.Arrays;
import java.util.Collections;

public class GreatestInArrSmallThanK {
        // Function to return k'th smallest
        // element in a given array
        public static int kthSmallest(Integer[] arr,
                                      int k)
        {
            // Sort the given array
            Arrays.sort(arr);

            // Return k'th element in
            // the sorted array
            return arr[k - 1];
        }

        // driver program
        public static void main(String[] args)
        {
            Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
            int k = 2;
            System.out.print("K'th smallest element is " + kthSmallest(arr, k));
        }
    }

// This code is contributed by Chhavi

