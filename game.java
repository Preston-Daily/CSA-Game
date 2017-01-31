import java.util.Scanner;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;


public class game
{
    public static void main(){
        Scanner user_input = new Scanner(System.in);
        
        
        
        try {
            Thread.sleep(750);
        } 
        catch (InterruptedException ex) {
           
        }
        
        
        
        
        System.out.println("Welcome, please wait while game is configuring.");
        
        
        
        
        try {
            Thread.sleep(3000); 
     
            //new page break-----------------------
            for (int i = 0; i <= 30; i++){
               System.out.println("\n");
            }    
            //new page break-----------------------
            
            System.out.println("Loading...");
            System.out.println("");
            Thread.sleep(2000); 
            System.out.println("3");
            Thread.sleep(1000); 
            System.out.println("2");
            Thread.sleep(1000); 
            System.out.println("1");
            Thread.sleep(1000); 
            
            //new page break-----------------------
            for (int i = 0; i <= 30; i++){
               System.out.println("\n");
            }    
            //new page break-----------------------
            
        } 
        catch (InterruptedException ex) {
            
        }
        
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
        System.out.println("When progressing in the story, remember to first choose");
        System.out.println("an object to interact with, then choose an action.");
        System.out.println("");
        System.out.println("The commands that you can call at anytime include: ");
        System.out.println("-    '/health'");
        System.out.println("-    '/armour'");
        System.out.println("-    '/inventory'");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("\n");
        
        
        
        System.out.println("Type your name to continue: ");
        String user_name = user_input.next();
        
        try {
            System.out.println("Storing...");
            Thread.sleep(1500);
        } 
        catch (InterruptedException ex) {
            
        }
        
        for (int i = 0; i <= 25; i++){
            System.out.println("\n");
        }    
        
        System.out.println("You awake...");
        System.out.println("Attempting to recollect");
        System.out.println("your thoughts, you panic in");
        System.out.println("the realization that you cannot");
        System.out.println("remember the past.");
        System.out.println("Finding yourself in a cold,");
        System.out.println("dark, and rather damp corridor.");
        System.out.println("The only visible light, permiates from");
        System.out.println("a door several paces away.");
        System.out.println("You notice a crate next to you.");
        System.out.println("It is emitting a strange sound.");
        System.out.println("");
        System.out.println("");
        System.out.println("What do you do?");
        String first_choice = user_input.next();
        
        
        

        
        
        
    
    }
}
