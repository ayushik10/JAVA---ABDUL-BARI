import java.lang.reflect.*;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x, int y) {}

    public void display(String s1, String s2) {}

    public int show(int x, int y) { return 0; }
}

public class ReflectPackageDemo {
    public static void main(String args[]) {
        Class c = My.class;

        Field field[] = c.getDeclaredFields();
        
        //Constructor con[] = c.getConstructors();

        //for(Constructor i:con)
        //System.out.println(i);

        Method m[] = c.getMethods();

        for(Method i:m)
        System.out.println(i);

        Parameter p[] = m[0].getParameters();

        for(Parameter i:p)
        System.out.println(i);

    }
}
