public class WrapperClass 
{
    public static void main(String args[]) 
    {
       // Integer i = new Integer(10); ---> Should not be written like this

        Integer x = Integer.valueOf(10);
        Integer y = 10;

        Byte a = 15;
        Byte b = Byte.valueOf("15");
        byte bb = 17;
        Byte c = Byte.valueOf(bb);

        Short s = Short.valueOf("120");

        Float f = 12.13f;
        Float g = Float.valueOf("12.13");

        Double d = Double.valueOf(123.4567);

        Character ch = Character.valueOf('a');

        Boolean bl = Boolean.valueOf(true);

        float m = f.floatValue();
        float n = f;


        // AUTO BOXING
        int i = 20;
        Integer j = i; 
        Integer k = Integer.valueOf(i);

        // AUTO UNBOXING
        Integer p = i;
        //int q = p.intValue();
        int q = p;

    }
}
