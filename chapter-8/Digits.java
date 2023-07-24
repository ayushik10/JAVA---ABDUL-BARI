//Display digits of a number.

import java.util.Scanner;

public class Digits {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Digits of " +n+ " are : ");
        while(n > 0) {
            System.out.println(n%10);
            n /= 10;
        }
    }
}
