//Display Fibonacci series

import java.util.Scanner;

public class FibonacciSeries {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n =sc.nextInt();

        int first = 0, second = 1, term;

        System.out.println("Fibonacci Series --->");

        System.out.print(first +" " +second + " ");

        for(int i=3; i<=n; i++) {
            
            term = first+second;
            System.out.print(term +" ");
            first = second;
            second = term;
        }
    }
    
}
