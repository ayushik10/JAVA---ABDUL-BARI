class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        radius = 1;
        height = 1;
    }

    public Cylinder(double r) {
        radius = r;
        height = 1;
    }

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setDimensions(double r, double h) {
        radius = r;
        height = h;
    }

    public double lidArea() {
        return Math.PI*radius*radius;
    }

    public double circumference() {
        return 2*Math.PI*radius;
    }

    public double totalSurfaceArea() {
        return 2*lidArea()+circumference()*height;
    }

    public double volume() {
        return lidArea()*height;
    }
}

public class CylinderChallenge {
    public static void main(String args[]) {
        
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(12.5, 5.5);
        Cylinder c3 = new Cylinder(12);

        System.out.println("--For c1--");
        System.out.println("Lid Area : " +c1.lidArea());
        System.out.println("Total Surface Area : " +c1.totalSurfaceArea());
        System.out.println("Volume : " +c1.volume() +"\n");

        System.out.println("--For c2--");
        System.out.println("Lid Area : " +c2.lidArea());
        System.out.println("Total Surface Area : " +c2.totalSurfaceArea());
        System.out.println("Volume : " +c2.volume() +"\n");

        System.out.println("--For c3--");
        System.out.println("Lid Area : " +c3.lidArea());
        System.out.println("Total Surface Area : " +c3.totalSurfaceArea());
        System.out.println("Volume : " +c3.volume() +"\n");
    }
    
}
