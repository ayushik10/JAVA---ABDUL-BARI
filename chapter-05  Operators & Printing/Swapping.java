public class Swapping {
    public static void main(String args[]) {

        int a=9, b=12;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Value after Swapping ---> " );
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    
}
