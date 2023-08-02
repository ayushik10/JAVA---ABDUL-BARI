//Recursive function to print counting

import java.util.Scanner;

public class CountingRecursively {

    static void counting(int n) {

        if(n>0) {
            counting(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Printing counting from 1 to " +n);
        counting(n);
    }
}
