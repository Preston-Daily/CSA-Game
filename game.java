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
            
        System.out.print("loading");
        wait(340);
        System.out.print(".");
        wait(340);
        System.out.print(".");
        wait(340);
        System.out.print(".");
  
        System.out.println("");
        wait(2000); 
        System.out.println("3");
        wait(1000); 
        System.out.println("2");
        wait(1000);  
        System.out.println("1");
        wait(1000);  
        System.out.println("(Gotta Blast!)");
        wait(1250); 
            
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
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("To check your current game stats such as health,");
        System.out.println("armour, and inventory, use the following command.");
        System.out.println("-  '/stats'");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("\n");
        
        
        
        System.out.println("Type your name: ");
        String user_name = user_input.next();
        System.out.println("");
        
        
        System.out.print("Storing");
        wait(400);
        System.out.print(".");
        wait(400);
        System.out.print(".");
        wait(400);
        System.out.print(".");
        wait(250);
        System.out.println("");
        
        System.out.println("Your name is now set as " + user_name);
        
        wait(1500);
        
        System.out.println("");
        System.out.println("");
        
        
        
        System.out.println("Type your gender: ");
        String user_gender = user_input.next();
        System.out.println("");
        
        
        System.out.print("Storing");
        wait(400);
        System.out.print(".");
        wait(400);
        System.out.print(".");
        wait(400);
        System.out.print(".");
        wait(250);
        System.out.println("");
        
        System.out.println("Your gender is now set as a(n) " + user_gender);
        
        wait(2100);
        
        
        
        
        for (int i = 0; i <= 35; i++){
            System.out.println("\n");
        }    
        
        System.out.println("You awake...");
        System.out.println("Attempting to recollect");
        System.out.println("your thoughts, you panic in");
        System.out.println("the realization that you cannot");
        System.out.println("remember the past.");
        wait(6000);
        System.out.println("");
        System.out.println("    Finding yourself in a cold,");
        System.out.println("dark, and rather damp corridor.");
        System.out.println("The only visible light, permiates from");
        System.out.println("a door several paces away.");
        System.out.println("You notice a crate next to you.");
        System.out.println("It is emitting a strange sound.");
        wait(7200);
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
                int health = 100;
                
                System.out.println("");
                System.out.println("----------------Health Information----------------");
                System.out.println("");
                System.out.println("Your health: ");
                System.out.print(health + "/100");
                System.out.println("");
                System.out.println("--------------------------------------------------");
            }
        }
        
        
        
        // Armour check
        
        String[] armourCheck = {"/armour"};
        for (String s: armourCheck)
        {
            if (s.toLowerCase().contains(lowerCheck))
            {
                int armour = 10;
                
                System.out.println("");
                System.out.println("----------------Armour Information----------------");
                System.out.println("");
                System.out.println("Your Armour rating: ");
                System.out.print(armour + "/10");
                System.out.println("");
                System.out.println("--------------------------------------------------");
            }
        }
        
        
        
        // Inventory check
        
        
        
        
        String[] inventoryCheck = {"/inventory"};
        for (String s: inventoryCheck)
        {
            if (s.toLowerCase().contains(lowerCheck))
            {
                System.out.println("");
                System.out.println("-------------Your Inventory Includes-------------");
                System.out.println("");
                
                // ==================Inventory Print==================
                String[] inventory = {"Pencil, ", "Necklace, "}; 
                int itemAmount = 2;
    
                for (int i = 0; i <= (itemAmount - 1); i++){
        
                    System.out.println(inventory[i]);
        
                }
                // =======================End=========================
                
                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("");
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
