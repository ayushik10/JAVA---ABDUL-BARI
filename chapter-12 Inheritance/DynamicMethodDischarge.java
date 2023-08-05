class Super {
    public void method1() { System.out.println("Super Method1"); }
    public void method2() { System.out.println("Super Method2"); }
}

class Sub extends Super {
    public void method2() { System.out.println("Sub Method2"); }
    public void method3() { System.out.println("Sub Method3"); }
}
public class DynamicMethodDischarge {
    public static void main(String args[]) {
        Sub s = new Sub();
        s.method1();
        s.method2();
        s.method3();

        //Super su = new Sub();
        //su.method1();
        //su.method2();
    }
}
