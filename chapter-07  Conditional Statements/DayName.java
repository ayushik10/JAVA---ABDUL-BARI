//Display name of a Day based on number

import java.util.Scanner;

public class DayName {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Day No : ");
        int day = sc.nextInt();

        if(day == 1) {
            System.out.println("Monday");
        }
        else if(day == 2) {
            System.out.println("Tuesday");
        }
        else if(day == 3) {
            System.out.println("Wednesday");
        }
        else if(day == 4) {
            System.out.println("Thursday");
        }
        else if(day == 5) {
            System.out.println("Friday");
        }
        else if(day == 6) {
            System.out.println("Saturday");
        }
        else if(day == 7) {
            System.out.println("Sunday");
        }
    }
    
}
