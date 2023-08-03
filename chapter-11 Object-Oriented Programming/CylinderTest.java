/* write a cylinder class

 Properties - radius, height;
 Methods - lidArea(), totalSurfaceArea(), volume();

*/

class Cylinder {
    public double radius;
    public double height;

    double lidArea() {
        return Math.PI*radius*radius;
    }

    double circumference() {
        return 2*Math.PI*radius;
    }

    double totalSurfaceArea() {
        return 2*lidArea()+circumference()*height;
    }

    double volume() {
        return lidArea()*height;
    }

}
public class CylinderTest {
    public static void main(String args[]) {

    Cylinder c =new Cylinder();

    c.radius = 7;
    c.height = 10;

    System.out.println("\nLid Area : " +(c.lidArea()));
    System.out.println("Total Surface Area : " +(c.totalSurfaceArea()));
    System.out.println("Volume : " +(c.volume()) +"\n");
    }
}
