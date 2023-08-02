//Find maximum of two numbers using method

import java.util.Scanner;

public class MaxOfTwoNumbers {

    static int max(int m, int n) {
        if(m>n)
        return m;
        else
        return n;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter the two elements : ");
        a = sc.nextInt();
        b = sc.nextInt();

        int maxElement = max(a,b);
        System.out.println("Maximum number is : " +maxElement);
    }
}
