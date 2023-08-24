interface Lambda 
{
    //public void display(String str);
    public int display(String str1, String str2);
}

public class MethodReference 
{
    /*public void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }*/

    /*public MethodReference(String str)
    {
        System.out.println(str.toUpperCase());
    }*/

    public static void main(String[] args) 
    {
        //for static method
        //Lambda l = MethodReference::reverse;

        //for non-static method
        //MethodReference m = new MethodReference();
        //Lambda l = m::reverse;

        //l.display("Ayushi Kumari");

        //for constructors
        Lambda l = String::compareTo;

        System.out.println(l.display("Ayushi Kumari", "ayushi kumari"));
    }
}
