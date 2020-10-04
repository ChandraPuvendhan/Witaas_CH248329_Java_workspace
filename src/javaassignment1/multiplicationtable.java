    /**
     * Java program that takes a number as input and prints its multiplication table upto 10.
     * Test Data:
     * Input a number: 8
     * Expected Output :
     * 8 x 1 = 8
     * 8 x 2 = 16
     * 8 x 3 = 24...
     * 8 x 10 = 80
     */
    package javaassignment1;

    import java.util.Scanner;

    public class multiplicationtable {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a Number to prints its multiplication table upto 10: ");
            int input = in .nextInt();
            System.out.println("Multiplication table of " +input+ " upto 10 is");
            for (int i = 1; i <= 10; i++) {
                    System.out.println(input + " * " + i + " = " + (input * i));
            }
        }
    }


