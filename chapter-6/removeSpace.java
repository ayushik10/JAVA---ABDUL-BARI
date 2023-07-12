import java.util.Scanner;

public class removeSpace {
    public static void main(String args[]) {
        String str;

        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter a string : ");
        str = ob.nextLine();

        System.out.println("String after removing extra spaces : ");
       
        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
    
}
