interface LambdaInterface 
{
    public void display();
}

/*class Demo {

    int temp = 5;
    public void meth1() 
    {
        //int count = 0;
        LambdaInterface li = ()-> {
            System.out.println("Hello");
            System.out.println("Bye "+(++temp));
        };
        li.display();
    }
}*/

class UseLambda 
{
    public void callLambda(LambdaInterface li)
    {
        li.display();
    }
}
class Demo 
{
    public void meth1() 
    {
        UseLambda ul = new UseLambda();
        ul.callLambda(()-> { System.out.println("Hello!!");});
    }
}

public class CaptureInLambdaExp {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.meth1();
    }
}
