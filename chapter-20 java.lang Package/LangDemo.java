class MyObject {
    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode()==o.hashCode();
    }
}

public class LangDemo {
    public static void main(String args[]) {

        //Object o1 = new Object();
        //System.out.println(o1);
        //System.out.println(o1.toString());

        //Object o2 = new Object();
        /*Object o2 = o1;
        System.out.println(o1.equals(o2));

        System.out.println(o1.hashCode());*/

        MyObject m1 = new MyObject();
        MyObject m2 = new MyObject();

        System.out.println(m1.equals(m2));
        
    }
}