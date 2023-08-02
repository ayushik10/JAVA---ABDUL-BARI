//Overload reverse function to calculate reverse of an integer and an array

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ReverseOvrloading {
    static int reverse(int n) {
        int rev = 0;
        while(n>0) {
            rev = (rev*10)+(n%10);
            n /= 10;
        }
        return rev;
    }

    static int[] reverse(int arr[]) {
        int brr[] = new int[arr.length];

        for(int i=arr.length-1, j=0; i<=0; i--, j++) {
            brr[j] = arr[i];
        }
        return brr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Reversed integer is : " +(reverse(n)));
        System.out.println();

        System.out.print("Enter the size of array : ");
        int m = sc.nextInt();

        int arr[] = new int[m];

        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<m; i++)
        arr[i] = sc.nextInt();

        System.out.println("Reversed Array : ");
        int b[] = reverse(arr);

        for(int i:b)
        System.out.print(i+" ");
    }
}
