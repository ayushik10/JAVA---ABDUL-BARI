import java.util.Scanner;

public class noOfWords {
    public static void main(String args[]) {
        String str, words[];

        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter a string : ");
        str = ob.nextLine();

        str = str.replaceAll("\\s+", " ").trim();

        words = str.split("\\s");

        System.out.print("Number of words in the string : ");
        System.out.println(words.length);
    }
    
}
