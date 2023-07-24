//Display the following pattern
/*
       * * * * *
         * * * *
           * * *
             * *
               *      
*/

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {

                if(j < i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
