import java.util.Scanner;

public class KeyRead {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter a & b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;

        System.out.println("Sum : " +c);
    }
    
}
