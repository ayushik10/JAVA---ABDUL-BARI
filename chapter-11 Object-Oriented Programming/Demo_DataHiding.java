//To implement getter and setter method

class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
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

    public int area() {
        return length*breadth;
    }

    public int perimeter() {
        return 2*(length+breadth);
    }

    public boolean isSquare() {
        return length==breadth;
    }
}

public class Demo_DataHiding {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();

        r.setLength(20);
        r.setBreadth(15);

        System.out.println("\nFor Rectangle --->");
        System.out.println("Length : " +(r.getLength()));
        System.out.println("Breadth : " +(r.getBreadth()));
        System.out.println("Area : " +(r.area()));
        System.out.println("Perimeter : " +(r.perimeter()));

        if(r.isSquare())
        System.out.println("It's a square");
        else
        System.out.println("It's not a square\n");

    }
}
