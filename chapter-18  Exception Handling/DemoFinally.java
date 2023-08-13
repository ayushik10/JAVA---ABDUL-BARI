public class DemoFinally 
{
    static void meth1()throws Exception
    {
        try
        {
            throw new Exception();
        }

        finally
        {
            System.out.println("Final Message");
        }
    }
    public static void main(String args[])throws Exception
    {
        /*try
        {
            System.out.println(10/0);
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        finally
        {
            System.out.println("Final Message");
        }
        */
        meth1();
    }
    
}
