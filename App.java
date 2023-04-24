package sg.edu.nus.iss;

import java.io.Console;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // scan methods keeps the console open
        Scanner scan = new Scanner(System.in);

        // this will exit the app once it prints 'hi there' -- still need to keep the scanner method in a while  loop
        while (!scan.nextLine().equals("quit")) {
            System.out.println("hi there");
        }
            
        System.out.println("Are you sure?");
        
        while (!scan.nextLine().equals("yes")) {
            System.out.println("thanks for staying");
        }

        scan.close();
        System.out.println("bye bye!");

        /*
        if (scan.nextLine().equals("yes")) {
                scan.close();
                System.out.println("bye bye!");
        } else if (scan.nextLine().equals("no")) {
            System.out.println("Thanks for staying");
        } // scanner will exit after 1 more iteration as it's not kept in a while loop

        /*
        // scan methods keeps the console open
        Scanner scan = new Scanner(System.in);

        while (!scan.nextLine().equals("quit")) {
            System.out.println("hi there");
        }
        
        scan.close();

        System.out.println("bye bye!");
        
        /*
        // test if console methods keep the console open
        Console con = System.console();
        
        String input = "";

        // if I do this, then the system will keep printing
        while (!input.equals("quit")) {
            System.out.println("yo bro");
        }
        
        // this works perfectly
        while (!input.equals("quit")) {
            input = con.readLine();
            System.out.println("yo bro");
        }
        
        // this works perfectly
        while (!con.readLine().equals("quit")) {
            System.out.println("heyyy");
        }
        
        System.out.println("bye de bye");
        */
    }
}
