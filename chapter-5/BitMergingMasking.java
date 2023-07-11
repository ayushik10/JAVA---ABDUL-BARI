public class BitMergingMasking {
    public static void main(String args[]) {
        
        byte a=9, b=12;
        byte c;

        c = (byte)(a<<4);
        c = (byte)(c|b);

        System.out.println((c&0b11110000)>>4);
        System.out.println(c&0b00001111);
    }
}
