abstract class Super {
    public Super() { System.out.println("Super Constructor"); }
    public void method1() { System.out.println("Method1 of Super"); }
    abstract public void method2();
}

class Sub extends Super {
    public void method2() { System.out.println("Sub Method2"); }
}

public class AbstractClassExample {
    public static void main(String args[]) {
        Sub s = new Sub();
        s.method1();
        s.method2();
    }
}