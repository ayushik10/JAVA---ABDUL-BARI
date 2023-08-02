//FIND WHETHER A PERSON IS YOUNG OR NOT

import java.util.Scanner;

public class Young {

    public static void main(String args[]) {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the person : ");
        age  = sc.nextInt();

        if(age>=14 && age<=55) {
            System.out.println("The person is young");
        }
        else {
            System.out.println("The person is not young");
        }
    }
    
}
