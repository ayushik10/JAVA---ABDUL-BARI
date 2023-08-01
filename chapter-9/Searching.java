//Searching an element in an array

import java.util.Scanner;

public class Searching {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int A[] = new int[n];
       
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search for : ");
        int key = sc.nextInt();


        for(int i=0; i<n; i++) {
            
            if(A[i] == key) {
                System.out.println("Element is found at index : " +i);
                System.exit(0);
            }           
        }

        System.out.println("Element not found!!");

    }
    
}
