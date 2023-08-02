//calculate sum of elements using variable arguments

public class SumUsingVariableArgs {

    static int sum(int ...A) {
        int s = 0;

        for(int i=0; i<A.length; i++)
        s += A[i];

        return s;
    }
    public static void main(String args[]) {

        System.out.println("Sum : " +(sum()));
        System.out.println("Sum : " +(sum(10,20)));
        System.out.println("Sum : " +(sum(10,20,30)));
        System.out.println("Sum : " +(sum(10,20,30,40)));
    }
    
}
