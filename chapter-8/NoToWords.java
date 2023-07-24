//Display a number in words even with trailing 0 

import java.util.Scanner;

public class NoToWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int temp = n;
        String str="";

        while(n>0) {
            str = str+(n%10);
            n /= 10;
        }

        System.out.print(temp +" =");

        for(int i=str.length()-1; i>=0; i--) {

            switch(str.charAt(i)) {

                case '0': {
                    System.out.print(" Zero");
                }
                case '1': {
                    System.out.print(" One");
                    break;
                }
                case '2': {
                    System.out.print(" Two");
                    break;
                }
                case '3': {
                    System.out.print(" Three");
                    break;
                }
                case '4': {
                    System.out.print(" Four");
                    break;
                }
                case '5': {
                    System.out.print(" Five");
                    break;
                }
                case '6': {
                    System.out.print("Six");
                    break;
                }
                case '7': {
                    System.out.print(" Seven");
                    break;
                }
                case '8': {
                    System.out.print(" Eight");
                    break;
                }
                case '9': {
                    System.out.print(" Nine");
                    break;
                }
            }
        }
    }
    
}
