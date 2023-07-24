//Reverse a number

import java.util.Scanner;

public class ReverseNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, temp, rev=0;

        System.out.println("Enter a number : ");
        n = sc.nextInt();
        temp = n;

        while(n>0) {
            rev = (rev*10) +(n%10);
            n /= 10;
        }

        System.out.println("Reverse of " +temp+ " is " +rev);
    }
}
