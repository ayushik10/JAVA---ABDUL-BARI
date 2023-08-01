//To print a jagged array

import java.util.Scanner;

public class JaggedArray {
    public static void main(String args[]) {
       
        int A[][] = new int[5][];

        A[0] = new int[4];
        A[1] = new int[3];
        A[2] = new int[2];
        A[3] = new int[4];
        A[4] = new int[1];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the array : ");
        
         for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing Jagged Array---->");

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}