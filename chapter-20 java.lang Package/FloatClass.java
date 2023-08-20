public class FloatClass {
    public static void main(String args[]) {

       // FLOAT CLASS

        float f1 = 15.7f;
        Float f2 = 15.7f;

        System.out.println(f2.equals(f1));

        Float f3 = 15.7f/0;
        System.out.println(f3.isInfinite());
        System.out.println(f2!=Float.POSITIVE_INFINITY);

        Float f4 = -15.7f/0;
        System.out.println(f4!=Float.NEGATIVE_INFINITY);

        Float f5 = (float)Math.sqrt(-1);
        System.out.println(f5.isNaN());
        System.out.println(f5!=Float.NaN);

    }
}
