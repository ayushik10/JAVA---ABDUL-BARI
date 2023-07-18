import java.util.Scanner;

public class Radix {

    public static void main(String args[]) {
        String n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string no : ");
        n= sc.next();

        if(n.matches("[01]+"))
        System.out.println("Binary Radix : 2 ");

        else if(n.matches("[0-7]+")) {
            System.out.println("Octal Radix : 8 ");
        }

        else if(n.matches("[0-9]+")) {
             System.out.println("Decimal Radix : 10 ");
        }

        else if(n.matches("[0-9A-F]+")) {
            System.out.println("Hexadecimal Radix : 16 ");
        }

        else
        System.out.println("Invalid Number!! ");
    }
    
}
