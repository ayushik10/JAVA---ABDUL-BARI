//Display the following pattern
/*
     2 3 4 5 6 
     3 4 5 6 7
     4 5 6 7 8
     5 6 7 8 9
     6 7 8 9 10
*/

import java.util.Scanner;

public class Pattern3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.format("%02d" ,(count++));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

