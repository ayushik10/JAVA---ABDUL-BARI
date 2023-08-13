public class MultipleException 
{
    public static void main(String args[])
    {
        int A[] = {10, 20, 40, 0, 30};

        try
        {
            int c = A[2]/A[1];
            System.out.println("Ans is : " +c);
            System.out.println(A[4]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is Invalid");
        }

        System.out.println("Program Executed Successfully");
    }
}