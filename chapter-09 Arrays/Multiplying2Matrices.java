import java.util.Scanner;

public class Multiplying2Matrices {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[][] = {{3,4,5}, {6,7,8}, {9,10,11}};
        int B[][] = {{2,4,6}, {3,5,7}, {9,11,13}};

        int C[][] = new int[A.length][A[0].length];

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                C[i][j] = 0;
                for(int k=0; k<3; k++) {
                    C[i][j] = C[i][j] + A[i][k]*B[k][j];
                }
            }
        }

        System.out.println("Product of matrices : ");

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }    
}
