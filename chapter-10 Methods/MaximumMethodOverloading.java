//Overload maximum function for int and float type

import java.util.Scanner;

public class MaximumMethodOverloading {

    static int max(int a, int b) {
        return (a>b)?a:b;
    }

    static float max(float m, float n) {
        return (m>n)?m:n;
    }
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter 2 integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter 2 Floating point values : ");
        float m = sc.nextFloat();
        float n = sc.nextFloat();

        int intMax = max(a, b);
        System.out.println("Maximum of 2 integers is : " +intMax);

        float floatMax = max(m, n);
        System.out.println("Maximim of floating point values is : " +floatMax);
    }
}
