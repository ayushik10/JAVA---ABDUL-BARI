@FunctionalInterface
interface MyLambda {
    public void display();
}

/*class My implements MyLambda {
    public void display() {
        System.out.println("Hello, It's Ayushi here");
    }
}*/

public class LambdaDemo {
    public static void main(String[] args) {

        //MyLambda m = new My();

        MyLambda m = ()-> { System.out.println("Hello, It's Ayushi here"); };
        m.display();
    }
}