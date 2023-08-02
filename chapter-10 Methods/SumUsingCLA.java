//Calculate sum of elements using command line argument

public class SumUsingCLA {
    public static void main(String args[]) {

        double d = 0;

        for(String s:args)
        d += Double.parseDouble(s);

        System.out.println("Sum : " +d);
    } 
}
