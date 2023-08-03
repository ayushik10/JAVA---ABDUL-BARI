class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
        //System.out.println("Non-Parametrized constructor is called!");
    }

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
        //System.out.println("Parametrized constructors with 2 parameters is called!!");
    }

    public Rectangle(double side) {
        length = breadth = side;
        //System.out.println("Parametrized constructor with 1 parameter is called!!");
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(int l) {
        if(l>=0)
        length = l;
        else
        length = 0;
    }

    public void setBreadth(int b) {
        if(b>=0)
        breadth = b;
    }

    public double area() {
        return getLength()*getBreadth();
    }
}

public class Constructors {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,5);
        Rectangle r3 = new Rectangle(4);

        System.out.println("Area1 : " +r1.area());
        System.out.println("Area2 : " +r2.area());
        System.out.println("Area3 : " +r3.area());
    }
}