//To check whether a no is Armstrong or not
//E.g.  n=153;
//  (3*3*3) + (5*5*5) + (1*1*1) = 153

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        long ans = 0;

        int temp = n;

        while (temp > 0) {

            int d = temp % 10;
            ans = ans + (d * d * d);
            temp /= 10;
        }

        if (ans == n) {
            System.out.println("Armstrong No ");
        }
         else {
            System.out.println("Not a Armstrong No ");
        }
    }
}
