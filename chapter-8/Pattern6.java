//Display the following pattern
/*
      1 2 3 4 5 
      1 2 3 4
      1 2 3
      1 2 
      1
*/

import java.util.Scanner;

public class Pattern6 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i+1); j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
