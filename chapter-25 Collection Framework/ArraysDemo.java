import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,5,7};

        int c[] = Arrays.copyOf(a,a.length);

        //Arrays.fill(c, 10);

        Arrays.sort(c);

        //for(int x:c)
        //System.out.println(x);

        System.out.println(Arrays.binarySearch(c,8));
    }
}
