@FunctionalInterface
interface NewLambda 
{
    //public void display(String str);
    public int add(int a, int b);
}

public class ParametersInLambdaExp 
{
    public static void main(String[] args)
    {
        //NewLambda n = (s)-> { System.out.println(s); };
        //n.display("Incredible India");

        //NewLambda n = (a,b)-> { return a+b; };
        
        NewLambda n = (a,b)-> a+b;
        
        int s = n.add(20,30);
        System.out.println(s);
    }
}
