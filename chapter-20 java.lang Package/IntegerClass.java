public class IntegerClass 
{
    public static void main(String args[])
    {
        int x1 = 10;

        /*Integer x2 = x1;
        Integer x3 = 10;

        System.out.println(x2.equals(x1));
        System.out.println(x2.equals(x3));*/

        Integer x2 = Integer.valueOf("120");
        Integer x3 = Integer.valueOf("A7", 16);
        Integer x4 = Integer.decode("0xA7");

        System.out.println(x3);
        System.out.println(x4);

        //CONVERTING STRING TO INTEGER
        System.out.println(Integer.parseInt("123"));

        System.out.println(Integer.reverse(x2));
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);

        System.out.println(Integer.toHexString(12));
    }
}
