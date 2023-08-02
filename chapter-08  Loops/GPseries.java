//Display Geometric Progression (GP)-series

import java.util.Scanner;

public class GPseries {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total no of terms for GP series : ");
        int n = sc.nextInt();
        System.out.println("Enter the first term of the series : ");
        int a = sc.nextInt();
        System.out.println("Enter the ratio : ");
        int r = sc.nextInt();

        int term = a;

        System.out.println("GP series--->");

        for(int i=0; i<n; i++) {
            System.out.print(term +" ");
            term = term*r;
        }
    }
    
}
