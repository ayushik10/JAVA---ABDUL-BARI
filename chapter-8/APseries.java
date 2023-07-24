//Display Arithmetic Progression (AP)-series 

import java.util.Scanner;

public class APseries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total no of terms for AP series : ");
        int n = sc.nextInt();
        System.out.println("Enter the first term of the series : ");
        int first = sc.nextInt();
        System.out.println("Enter the common difference : ");
        int d = sc.nextInt();

        int term = first;

        System.out.println("AP series--->");

        for(int i=0; i<n; i++) {
            System.out.print(term +" ");
            term = term+d;
        }
    }
}
