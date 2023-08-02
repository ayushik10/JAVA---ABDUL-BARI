//To check whether a number is Palindrome or not

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, ans=0;

        System.out.println("Enter a number : ");
        n =  sc.nextInt();

        int temp = n;
        while(temp>0) {
            ans = ans*10 +(temp%10);
            temp /= 10;
        }

        if(ans == n) 
        System.out.println("Palindrome No");
        else
        System.out.println("Not a Palindrome No");
    }
}
