//Find Maximum of different numbers using variable argument

import java.util.Scanner;

public class MaxOfDifferentNumbers {

    static int max(int ...A) {
        if(A.length == 0)
        return Integer.MIN_VALUE;

        int max = A[0];
        for(int i=1; i<A.length; i++) {
            if(A[i] > max)
            max = A[i];
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Maximum Value : " +(max(5)));
        System.out.println("Maximum Value is : " +(max(13,5,11)));
        System.out.println("Maximum Value is : " +(max(34,89,66,48)));

    }
}
