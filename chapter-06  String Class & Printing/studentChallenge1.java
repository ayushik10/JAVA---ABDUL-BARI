import java.util.Scanner;

public class studentChallenge1 {
    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a string : ");
        String str = sc.next();

        int i=str.indexOf('@');
        String s1 = str.substring(0,i);
        String s2 = str.substring(i+1, str.length());

        System.out.println("\nUsername : " +s1);
        System.out.println("Domain name : " +s2);

        System.out.println(s2.startsWith("gmail"));
    }
}    