//Menu driven program to perform arithmetic operations

import java.util.Scanner;

public class Arithmetic {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------");
        System.out.println("---MENU---");
        System.out.println("----------");
        System.out.println("   ADD   ");
        System.out.println("   SUB   ");
        System.out.println("   PROD  ");
        System.out.println("   DIV   ");
        System.out.println("----------");

        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the Operation name in words : ");
        String op = sc.next();

        switch(op) {
            case "ADD": {
                System.out.println(a+b);
                break;
            }

            case "SUB": {
                System.out.println(a-b);
                break;
            }

            case "PROD": {
                System.out.println(a*b);
                break;
            }

            case "DIV": {
                System.out.println(a/b);
                break;
            }

            default:
            System.out.println("Wrong Entry!!");
        }
    }
}
