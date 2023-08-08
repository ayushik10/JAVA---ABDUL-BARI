/*abstract class My {
    abstract public void show();
}*/

interface My {
    public void show();
}

class Outer {
    public void display() {
        //anonymous class with anonymous object
        //new My() { public void show() { System.out.println("Hello");}}.show();
        
        My m = new My() { public void show() { System.out.println("Hello");}};
        m.show();
    }
}

public class AnonymousInnerClass {
    public static void main(String args[]) {
        Outer o = new Outer();
        o.display();
    }
}