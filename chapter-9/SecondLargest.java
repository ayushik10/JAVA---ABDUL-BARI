//Find second largest element of an array

import java.util.Scanner;

public class SecondLargest {
    public static void main(String args[]) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        int max1, max2;
        max1 = max2 = A[0];

        for(int i=0; i<n; i++) {
            if(A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i] > max2)
            max2 = A[i];
        }

        System.out.println("Second Largest Element is " +max2);
    }
}
