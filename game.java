import java.util.Scanner;
import java.io.*;
public class game
{
    public static void main(){
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Welcome to Castle Roam!");
        
        System.out.println("Type your name to continue: ");
        String user_name = user_input.next();
        
        try {
            System.out.println("Scanning...");
            Thread.sleep(1000); // 1 second
        } 
        catch (InterruptedException ex) {
            // handle error
        }
        
        System.out.println("Hello " + user_name + "!");
        
        
    
    }
}
