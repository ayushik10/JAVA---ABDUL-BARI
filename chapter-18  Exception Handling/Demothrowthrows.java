class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions cannot be negative";
    }
}

public class Demothrowthrows 
{
        static int area(int l, int b) throws NegativeDimensionException
        {
            if(l<0 || b<0)
            throw new NegativeDimensionException();

            return l*b;
        }

        static void displayArea() throws NegativeDimensionException
        {
            System.out.println("Area is : " +area(-10,5));
            //System.out.println("Area is : " +area(10,5));
        }

        public static void main(String args[]) throws NegativeDimensionException
        {
            try 
            {
                displayArea();
            }

            catch(Exception e)
            {
                System.out.println(e);
            }
        }
}
