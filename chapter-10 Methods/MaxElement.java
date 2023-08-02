//Find maximum element of an array

import java.util.Scanner;

public class MaxElement {

    static int maxi(int A[]) {

        int max = A[0];
        for(int i=1; i<A.length; i++) {
            if(A[i] > max)
            max = A[i];
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[5];
        
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<A.length; i++) 
        A[i] = sc.nextInt();

        int max = maxi(A);
        System.out.println("Maximum Element of the array is : " + max);
    }
}
