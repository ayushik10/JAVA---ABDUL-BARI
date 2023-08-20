enum Dept {
    CS, IT, CIVIL, ECE;

    private Dept() {
        System.out.println(this.name());
    }

    public void display() {
        System.out.println(this.name() + " " + this.ordinal());
    }
}

public class EnumDemo {
    public static void main(String args[]) {
        Dept d = Dept.CIVIL;
       
       // System.out.println(d.ordinal());
       // System.out.println(Dept.valueOf("IT"));

       /*Dept List[] = Dept.values();

       for(Dept i : List)
       System.out.println(i);*/

       d.display();


    }
}
