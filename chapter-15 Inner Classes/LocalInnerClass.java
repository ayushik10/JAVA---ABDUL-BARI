class Outer {
    public void display() {
        class Inner {
            public void show() {
                System.out.println("Hello");
            }
        }
        //new Inner().show(); ----> without reference...
        //the object is anonymous and is useful onllly for this line
        Inner i =  new Inner();
        i.show();
    }
}

public class LocalInnerClass {
    public static void main(String srgs[]) {
        Outer o = new Outer();
        o.display();
    } 
}
