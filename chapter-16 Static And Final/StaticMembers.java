class Test {
    static int x = 10;
    int y = 20;

    public void display1() {
        System.out.println(x+ " " +y);
    }

    static void display2() {
        System.out.println(x);
    }
}

public class StaticMembers {
    public static void main(String args[]) {
        Test t1 = new Test();
        //t1.display1();
        t1.x=15;
        t1.y=25;
        t1.display1();

        Test t2 = new Test();
        t2.display1();

        t2.display2();
    }
}