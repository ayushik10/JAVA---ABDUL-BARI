class Super {
    public void display() {
        System.out.println("Super Class Display");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Sub Class Display");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        //Super sup = new Super();
       // sup.display();

       //Sub s = new Sub();
       //s.display();

       Super sup = new Sub();
       sup.display();

    }
}
