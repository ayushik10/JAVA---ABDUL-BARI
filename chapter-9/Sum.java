//Find the sum of all the elements of an array

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int A[] = new int[n];
        int sum = 0;

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        for(int x:A) {
            sum += x;
        }

        System.out.println("Sum of array elements is : " +sum);
    }
}