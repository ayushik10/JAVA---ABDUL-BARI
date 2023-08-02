import java.util.Scanner;

public class date {
    public static void main(String args[]) {
        String d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date : ");
        d = sc.next();

        System.out.print("Date Format is ");
        System.out.println(d.matches("[0-9][0-9]/[01][0-9]/[0-9]{4}"));
    }
    
}
