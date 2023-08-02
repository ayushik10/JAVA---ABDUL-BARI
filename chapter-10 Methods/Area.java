//Overload function to calculate area of a rectangle and circle

import java.util.Scanner;

public class Area {

    static int Area(int a, int b) {
        return a*b;
    }

    static float Area(int r) {
        return 3.14f*r*r;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and breadth of rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the radius of circle : ");
        int r = sc.nextInt();

        int rectArea = Area(l,b);
        System.out.println("Area of rectangle is : " +rectArea);

        float circleArea = Area(r);
        System.out.println("Area of circle is : " +circleArea);
    }
}