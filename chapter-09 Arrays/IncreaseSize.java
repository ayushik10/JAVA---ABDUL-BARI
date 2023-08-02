//Increase size of an array

import java.util.Scanner;

public class IncreaseSize {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[5];
        System.out.println("Length of Array : " + A.length);

        int B[] = new int[2*A.length];
        A = B;
        B = null;

        System.out.println("New Length of Array : " + A.length);
    }
}
