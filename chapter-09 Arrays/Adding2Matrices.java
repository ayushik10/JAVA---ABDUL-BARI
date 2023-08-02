//Adding 2 Matrices

import java.util.Scanner;

public class Adding2Matrices {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[][] = {{3,4,5}, {6,7,8}, {9,10,11}};
        int B[][] = {{2,4,6}, {3,5,7}, {9,11,13}};

        int C[][] = new int[A.length][A[0].length];

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum of matrices : ");

        for(int i=0; i<C.length; i++) {
            for(int j=0; j<C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
