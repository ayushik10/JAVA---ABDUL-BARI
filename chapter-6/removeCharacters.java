//To remove special characters from a string.

import java.util.Scanner;

public class removeCharacters {
    public static void main(String args[]) {
        String str;

        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter a string : ");
        str = ob.next();

        System.out.println("String after removing special characters : ");
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
