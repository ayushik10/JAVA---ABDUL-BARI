interface Test {
    void method1();
    void method2();
}

class Demo implements Test {
    public void method1() {
        System.out.println("Method1 of class Demo");
    }

    public void method2() {
        System.out.println("Method2 of class Demo");
    }

    public void method3() {
        System.out.println("Method3 of class Demo");
    }
}

public class InterfacePractice {
    public static void main(String args[]) {
   
        //not allowed
        // Test t = new Test();

        Test t = new Demo();
        t.method1();
        t.method2();

        Demo d = new Demo();
        d.method3();
    }
}