/* Write a class for circle

   Properties - radius;
   Methods - area(), perimeter(), circumference();

*/

class Circle {

   public  double radius;

   public double area() {
    return Math.PI*radius*radius;
   }

   public double perimeter() {
    return 2*Math.PI*radius;
   }

   public double circumference() {
    return perimeter();
   }
    
}

public class CircleTest {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 7;
        c2.radius = 10;

        System.out.println("\nCircle 1 --->");
        System.out.println("Area : " +(c1.area()));
        System.out.println("Perimeter : " +(c1.perimeter()));
        System.out.println("Circumference : " +(c1.circumference())+ "\n");

        System.out.println("Circle 2 --->");
        System.out.println("Area : " +(c2.area()));
        System.out.println("Perimeter : " +(c2.perimeter()));
        System.out.println("Circumference : " +(c2.circumference())+ "\n");
    }
}