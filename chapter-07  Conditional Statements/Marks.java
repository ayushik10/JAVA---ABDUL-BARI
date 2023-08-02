//FIND THE GRADE FOR GIVEN MARKS

import java.util.Scanner;

public class Marks {
    public static void main(String args[]) {
        int m1, m2, m3;
        float avg;
        float total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of three subjects : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

       total = (float)(m1+m2+m3);
       avg = total/3;

       if(avg>=70)
       System.out.println("Grade : A");

       else if(avg<70 && avg >=60)
       System.out.println("Grade : B");

       else if(avg<60 && avg>=50)
       System.out.println("Grade : C");

       else if(avg<50 && avg >=40)
       System.out.println("Grade : D");

       else if(avg<40)
       System.out.println("Grade : Fail");
    }

}
