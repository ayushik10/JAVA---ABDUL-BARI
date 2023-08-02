//Find maximum element in an array

import java.util.Scanner;

public class MaxElement {
    public static void main(String args[]) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        int max = A[0];

        for(int i=0; i<n; i++) {
            if(A[i] > max)
            max = A[i];
        }

        System.out.println("Maximum Element is " +max);
    }
}
