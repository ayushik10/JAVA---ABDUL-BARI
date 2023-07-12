import java.util.Scanner;

public class hexadecimalNo {
     public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        String str = sc.next();

        System.out.print("Hexadecimal or not : ");
        System.out.println(str.matches("[0-9A-F]+"));

    }
}
