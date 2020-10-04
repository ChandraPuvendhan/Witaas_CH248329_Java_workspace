package javaassignment1;

public class cmdlnarg {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int sum=i+j;
        System.out.println("Sum :"+sum);

    }
}
