//Copying an array

import java.util.Scanner;

public class CopyArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];
       
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            B[i] = A[i];
        }

        System.out.println("New Array formed by copying another array--->");
        for(int x:B)
        System.out.print(x+ " ");
    }
}
