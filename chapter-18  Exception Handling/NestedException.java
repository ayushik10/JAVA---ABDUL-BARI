public class NestedException 
{
    public static void main(String args[])
    {

        int A[] = {10, 20, 40, 0, 30};

        try
        {
            int c = A[2]/A[1];
            System.out.println("Ans is : " +c);

            try
            {
                System.out.println(A[5]);
            }

            catch(ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("Invalid Index");
            }
        }

        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }

        System.out.println("Program Ended");
    }
}
