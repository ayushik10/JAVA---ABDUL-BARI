import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class WebsiteII {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website : ");
        String web = sc.nextLine();

        String extension = web.substring(web.lastIndexOf(".")+1);

        switch(extension)
        {
            case "com": {
                System.out.println("Commercial Website");
                break;
            }

            case "org": {
                System.out.println("Organisational Website");
                break;
            }

            case "gov": {
                System.out.println("Governmental Website");
                break;
            }

            case "net": {
                System.out.println("Network Website");
                break;
            }

            default:
            System.out.println("Invalid Website!!");
        }
    
    }
}
