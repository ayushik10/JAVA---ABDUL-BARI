//Find the type of website and the protocol used
// http - hyper text transfer protocol            com - commercial
// ftp - file transfer protocol                   org - organisaation
//                                                net - network

import java.util.Scanner;

public class website {                 
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL : ");
        String url = sc.nextLine();

        System.out.println();

        String protocol = url.substring(0, url.indexOf(":"));

        if(protocol.equals("http")) {
            System.out.println("It is a HYPER TEXT TRANSFER PROTOCOL!!");
        }

        else if(protocol.equals("ftp")) {
            System.out.println("It is a FILE TRANSFER PROTOCOL!!");
        }

        String extension = url.substring(url.lastIndexOf(".")+1);

        if(extension.equals("com")) {
            System.out.println("It is a Commercial Website!");
        }
        else if(extension.equals("org")) {
            System.out.println("It is an Organisational Website!");
        }
        else if(extension.equals("net")) {
            System.out.println("It is a Network Website!");
        }

        System.out.println();
    }
    
}
