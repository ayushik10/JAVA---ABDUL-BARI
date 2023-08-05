class Parent {
    public Parent() {
        System.out.println("Non-Parametrized parent constructor is called!");
    }

    public Parent(int a) {
        System.out.println("Parametrized parent constructor is called!");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non-Parametrized child constructor is called!");
    }

    public Child(int a) {
        System.out.println("Parametrized(I) Child constructor is called!");
    }

    public Child(int a, int b) {
        super(a);
        System.out.println("Parametrized(II) child Constructor is called!");
    }
}

public class ParametrizedConstructorInheritance {
    public static void main(String args[]) {

        Child c1 = new Child();
        System.out.println();
        Child c2 = new Child(15);
        System.out.println();
        Child c3 = new Child(10, 20);
    }
}
