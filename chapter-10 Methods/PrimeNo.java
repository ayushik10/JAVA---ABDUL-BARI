//write isPrime() method to check prime no.

import java.util.Scanner;

public class PrimeNo {

    static boolean isPrime(int n) {
        for(int i=2; i<n/2; i++) {
            if(n%i == 0)
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(isPrime(n) == true)
        System.out.println("Prime Number!!");
        else
        System.out.println("Not a Prime Number!!");
    }
}
