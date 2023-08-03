/* Write a Rectangle class
   
   Properties - length, breadh;
   Methods - area(), perimeter();

*/

class Rectangle {
    public int length;
    public int breadth;

    int area() {
        return length*breadth;
    }

    int perimeter() {
        return 2*(length+breadth);
    }

    boolean isSquare() {
        return length==breadth;
     
    }
}

public class RectangleTest {

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.length = 20;
        r1.breadth = 10;

        System.out.println("\nRectangle 1 --->");
        System.out.println("Area : " +(r1.area()));
        System.out.println("Perimeter : " +(r1.perimeter()));

        if(r1.isSquare())
        System.out.println("It's a square");
        else
        System.out.println("It's not a square");


        r2.length = 15;
        r2.breadth = 15;

        System.out.println("\nRectangle 2 --->");
        System.out.println("Area : " +(r2.area()));
        System.out.println("Perimeter : " +(r2.perimeter()));

        if(r2.isSquare())
        System.out.println("It's a square\n");
        else
        System.out.println("It's not a square\n");

    }
    
}
