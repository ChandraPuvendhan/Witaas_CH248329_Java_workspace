/**
 * Java program to calculate the factorial of a number without using any loop
 */

package com.WiTaas6.ch248329_javaassignment1;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

class Factorial {
        public static int fac(final int _n) {
            final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(1);
            final Timer timer = new Timer(0, null);
            timer.addActionListener(new ActionListener() {
                int result = 1;
                int n = _n;
                public void actionPerformed(ActionEvent e) {
                    result *= n;
                    n--;
                    if(n == 0) {
                        try {
                            queue.put(result);
                        } catch(Exception ex) {
                        }
                        timer.stop();
                    }
                }
            });
            timer.start();
            int result = 0;
            try {
                result = queue.take();
            } catch(Exception ex) {
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int digits = in.nextInt();

            System.out.println(fac(digits));
        }
    }
