import java.util.ArrayDeque;

public class ArrayDequeDemo
{
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);

        //dq.forEach((x)->System.out.println(x));

        /*dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.offerFirst(5);*/

        //dq.pollLast();--->acts as stack
        dq.pollFirst();//--->acts as queue

        dq.forEach((x)->System.out.println(x));

    }   
}
