import java.util.Scanner;

public class binaryNo {
    public static void main(String args[]) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        n = sc.nextInt();

        String str = n+"";

        System.out.print("Binary or not : ");
        System.out.println(str.matches("[01]*"));

    }
    
}
