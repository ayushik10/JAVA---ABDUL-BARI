import java.util.Scanner;

public class DataTypes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        byte b;
        System.out.println("Enter a no(byte) : ");
        b = sc.nextByte();
        System.out.println("byte - " +b);

        short sh;
        System.out.println("\nEnter a no(short) : ");
        sh = sc.nextShort();
        System.out.println("short - " +sh);

        int i;
        System.out.println("\nEnter a no(int) : ");
        i = sc.nextInt();
        System.out.println("integer - " +i);

        long l;
        System.out.println("\nEnter a no(long) : ");
        l = sc.nextLong();
        System.out.println("long - " +l);

        float f;
        System.out.println("\nEnter a no(float) : ");
        f = sc.nextFloat();
        System.out.println("float - " +f);

        double d;
        System.out.println("\nEnter a no(double) : ");
        d = sc.nextDouble();
        System.out.println("double - " +d);

        String s;
        System.out.println("\nEnter a string (word) : ");
        s = sc.next();
        System.out.println("string(word) - " +s);

        String str;
        System.out.println("\nEnter a string (sentence) : ");
        str = sc.nextLine();
        System.out.println("string(sentence) - " +str);

        boolean bl;
        System.out.println("\nEnter true or false : ");
        bl = sc.nextBoolean();
        System.out.println("boolean - " +bl);


    }
    
}
