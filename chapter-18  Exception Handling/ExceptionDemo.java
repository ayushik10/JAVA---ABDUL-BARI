import java.util.Scanner;

public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numinator & denominator : ");
        a = sc.nextInt();
        b = sc.nextInt();

        try
        {
            c = a/b;  
            System.out.println("Ans : " +c);
        }
     
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again!");
        }

        System.out.println("Program Ends");
    }
}