//Display the count of digits of a number

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int count = 0;

        System.out.print("Total count of digits in " +n+ " is ");

        while(n>0) {
            int d=n%10;
            count++;
            n /= 10;
        }

        System.out.println(count);
    }
}
