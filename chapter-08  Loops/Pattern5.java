//Display the following pattern
/*
     1
     1 2
     1 2 3
     1 2 3 4 
     1 2 3 4 5 
*/

import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print((count++)+ " ");
            }
            System.out.println();
        }
    }
}
