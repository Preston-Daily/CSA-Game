import java.util.Scanner;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;


public class game
{
    public void wait(int time){
        try {
            Thread.sleep(time);
        } 
        catch (InterruptedException ex) {
           
        }
    }
    public  void main(){
        Scanner user_input = new Scanner(System.in);
        
        wait(750);
        
        System.out.println("Welcome, please wait while game is configuring.");
        
        wait(3000);
        //new page break-----------------------
        for (int i = 0; i <= 40; i++){
            System.out.println("\n");
        }    
        //new page break-----------------------
            
        System.out.println("Loading...");
        System.out.println("");
        wait(2000); 
        System.out.println("3");
        wait(1000); 
        System.out.println("2");
        wait(1000);  
        System.out.println("1");
        wait(1000);  
        System.out.println("(Gotta Blast!)");
        wait(1000); 
            
        //new page break-----------------------
        for (int i = 0; i <= 40; i++){
           System.out.println("\n");
        }    
        //new page break-----------------------

        
        System.out.println("\n");
        System.out.println("=======================================================");
        System.out.println("#######################################################");
        System.out.println("#######################################################");
        System.out.println("##################### PAST DAWN #######################");
        System.out.println("#######################################################");
        System.out.println("################ Created by Daily Inc. ################");
        System.out.println("#######################################################");
        System.out.println("#######################################################");
        System.out.println("=======================================================");
        System.out.println("\n");
        wait(3000);
        System.out.println("-------------------------------------------------------");
        System.out.println("To check your stats at any time, use the following command.");
        System.out.println("-    '/stats'");
        
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("\n");
        
        
        
        System.out.println("Type your name: ");
        String user_name = user_input.next();
        System.out.println("");
        
        
        System.out.println("Storing...");
        wait(1500);
        
        System.out.println("Your name is " + user_name);
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Type your gender: ");
        String user_gender = user_input.next();
        System.out.println("");
        
        
        System.out.println("Storing...");
        wait(1500);
        
        System.out.println("Your gender is " + user_gender);
        
        wait(1500);
        
        
        
        
        for (int i = 0; i <= 35; i++){
            System.out.println("\n");
        }    
        
        System.out.println("You awake...");
        System.out.println("Attempting to recollect");
        System.out.println("your thoughts, you panic in");
        System.out.println("the realization that you cannot");
        System.out.println("remember the past.");
        wait(1000);
        System.out.println("Finding yourself in a cold,");
        System.out.println("dark, and rather damp corridor.");
        System.out.println("The only visible light, permiates from");
        System.out.println("a door several paces away.");
        System.out.println("You notice a crate next to you.");
        System.out.println("It is emitting a strange sound.");
        wait(1500);
        System.out.println("");
        System.out.println("");
        System.out.println("What do you do?");
        
        
        
        
        
        // STAT CHECK
        
        String stat_check = user_input.next();
       
        String lowerCheck = stat_check.toLowerCase();  
        
        
        
        // Health check
        
        String[] healthCheck = {"/health"};
        for (String s: healthCheck)
        {
            if (s.toLowerCase().contains(lowerCheck))
            {
                System.out.println("");
                System.out.println("Your health: 100/100");
            }
        }
        
        
        
        // Armour check
        
        String[] armourCheck = {"/armour"};
        for (String s: healthCheck)
        {
            if (s.toLowerCase().contains(lowerCheck))
            {
                System.out.println("");
                System.out.println("Your Armour rating: 10/10");
            }
        }
        
        
        
        // Inventory check
        
        String[] inventory = {"'Pencil'", "'necklace'"};
        
        String[] inventoryCheck = {"/inventory"};
        for (String s: healthCheck)
        {
            if (s.toLowerCase().contains(lowerCheck))
            {
                System.out.println("");
                System.out.println("Your inventory: " + inventory);
            }
        }
        
        
        // END OF STAT CHECK SITUATION
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        String first_choice = user_input.next();
       
        String lowerFirst = first_choice.toLowerCase();  
        
        String[] first_answer = {"hallway", "walk"};
        for (String s: first_answer)
        {
            if (s.toLowerCase().contains(lowerFirst))
            {
                System.out.println("");
                System.out.println("You journey down the hallway.");
                
            }
        }
    }
}
