//Deleting an element from an array

import java.util.Scanner;

public class Deletion {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int A[] = new int[100];
       
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the element to delete : ");
        int element = sc.nextInt();

        System.out.print("Enter the index for the element to delete : ");
        int index = sc.nextInt();

        System.out.print("Array before Deletion---> ");
        for(int i=0; i<n; i++)
        System.out.print(A[i] + " ");

        System.out.println();

        for(int i=index; i<n-1; i++) {
            A[i] = A[i+1];
        }
        n--;

        System.out.print("Array after Deletion---> ");
        for(int i=0; i<n; i++)
        System.out.print(A[i] + " ");

        System.out.println();
    }
}
