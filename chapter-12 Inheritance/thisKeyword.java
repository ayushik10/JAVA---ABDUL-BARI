class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Length of Rectangle : " +this.length);
        System.out.println("Breadth of Rectangle : " +this.breadth);
    }
}

public class thisKeyword {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(20, 10);
        r.display();
    }
}
