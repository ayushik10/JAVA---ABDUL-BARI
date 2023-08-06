abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape {
    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }
} 

class Rectangle extends Shape {
    public double length;
    public double breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double perimeter() {
        return 2*(length+breadth);
    }

    public  double area() {
        return length*breadth;
    }
} 

public class ShapeClassChallenge {
    public static void main(String args[]) {

        Shape c = new Circle(10.5);

        System.out.println("Perimeter of Circle : " +c.perimeter());
        System.out.println("Area of Circle : " +c.area());

        System.out.println();

        Shape r = new Rectangle(20, 10);

        System.out.println("Perimeter of Rectangle : " +r.perimeter());
        System.out.println("Area of Rectangle : " +r.area());
    }
    
}
