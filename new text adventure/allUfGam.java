import java.util.Scanner;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Random;

public class allUfGam{

    Scanner user_input = new Scanner(System.in);
    int hit = 20;
    int weakplayerDamage = 20;
    int playerDamage = 40;
    int itemAmount = 2;
    int playerAmbushed = 0;
    
    
    
    public void health(int addedhealth){
        for(int i = 0; i > 0; i++){
           int health = 100;
           health = addedhealth;
           System.out.println("(Current health: " + health + ")");
           System.out.println("");
        }
    }
    
    public static  int rollDice(int number, int nSides) {
        int num = 0;
        if(nSides >=3)
        {
            for(int i = 0; i < number; i++){
                Random  r = new Random(); 
                int roll = r.nextInt();
                num = num + (roll % nSides)+1;

            }
        }
        else{
            System.out.println("Error num needs to be from 3");

        }
        return num; 
    } 
    
    
    
    
    public void wait(int time){
        try {
            Thread.sleep(time);
        } 
        catch (InterruptedException ex) {
           
        }
    }
    
    
    
    public void START(){
        
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
        
         //new page break-----------------------
        for (int i = 0; i <= 45; i++){
           System.out.println("\n");
        }    
        //new page break-----------------------
        
        wait(70);
        
                                                                                                     
        System.out.println("PPPPPPPPPPPPPPPPP           AAA                    SSSSSSSSSSSSSSS    TTTTTTTTTTTTTTTTTTTTTTT"); 
        wait(70);
        System.out.println("P::::::::::::::::P         A:::A                 SS:::::::::::::::S   T:::::::::::::::::::::T");    
        wait(70);
        System.out.println("P::::::PPPPPP:::::P       A:::::A               S:::::SSSSSS::::::S   T:::::::::::::::::::::T"); 
        wait(70);
        System.out.println("PP:::::P     P:::::P     A:::::::A              S:::::S     SSSSSSS   T:::::TT:::::::TT:::::T");   
        wait(70);
        System.out.println("  P::::P     P:::::P    A:::::::::A             S:::::S               TTTTTT  T:::::T  TTTTTT"); 
        wait(70);
        System.out.println("  P::::P     P:::::P   A:::::A:::::A            S:::::S                       T:::::T");     
        wait(70);
        System.out.println("  P::::PPPPPP:::::P   A:::::A A:::::A            S::::SSSS                    T:::::T");   
        wait(70);
        System.out.println("  P:::::::::::::PP   A:::::A   A:::::A            SS::::::SSSSS               T:::::T");   
        wait(70);
        System.out.println("  P::::PPPPPPPPP    A:::::A     A:::::A             SSS::::::::SS             T:::::T ");  
        wait(70);
        System.out.println("  P::::P           A:::::AAAAAAAAA:::::A               SSSSSS::::S            T:::::T");  
        wait(70);
        System.out.println("  P::::P          A:::::::::::::::::::::A                   S:::::S           T:::::T");  
        wait(70);
        System.out.println("  P::::P         A:::::AAAAAAAAAAAAA:::::A                  S:::::S           T:::::T");   
        wait(70);
        System.out.println("PP::::::PP      A:::::A             A:::::A     SSSSSSS     S:::::S         TT:::::::TT");  
        wait(70);
        System.out.println("P::::::::P     A:::::A               A:::::A    S::::::SSSSSS:::::S         T:::::::::T");   
        wait(70);
        System.out.println("P::::::::P    A:::::A                 A:::::A   S:::::::::::::::SS          T:::::::::T");  
        wait(70);
        System.out.println("PPPPPPPPPP   AAAAAAA                   AAAAAAA   SSSSSSSSSSSSSSS            TTTTTTTTTTT");  
        wait(70);
                                                                                                        
                                                                                                        
                                                                                                        
                                                                                                        
                                                                                                        
                                                                                                        
                                                                                                        
                                                                                                                                                                                                      
        System.out.println("DDDDDDDDDDDDD                    AAA     WWWWWWWW                           WWWWWWWW  NNNNNNNN        NNNNNNNN");
        wait(70);
        System.out.println("D::::::::::::DDD                A:::A    W::::::W                           W::::::W  N:::::::N       N::::::N");
        wait(70);
        System.out.println("D:::::::::::::::DD             A:::::A   W::::::W                           W::::::W  N::::::::N      N::::::N");
        wait(70);
        System.out.println("DDD:::::DDDDD:::::D           A:::::::A  W::::::W                           W::::::W  N:::::::::N     N::::::N");
        wait(70);
        System.out.println(" D:::::D    D:::::D          A:::::::::A  W:::::W           WWWWW           W:::::W   N::::::::::N    N::::::N");
        wait(70);
        System.out.println(" D:::::D     D:::::D        A:::::A:::::A  W:::::W         W:::::W         W:::::W    N:::::::::::N   N::::::N");
        wait(70);
        System.out.println(" D:::::D     D:::::D       A:::::A A:::::A  W:::::W       W:::::::W       W:::::W     N:::::::N::::N  N::::::N");
        wait(70);
        System.out.println(" D:::::D     D:::::D      A:::::A   A:::::A  W:::::W     W:::::::::W     W:::::W      N::::::N N::::N N::::::N");
        wait(70);
        System.out.println(" D:::::D     D:::::D     A:::::A     A:::::A  W:::::W   W:::::W:::::W   W:::::W       N::::::N  N::::N:::::::N");
        wait(70);
        System.out.println(" D:::::D     D:::::D    A:::::AAAAAAAAA:::::A  W:::::W W:::::W W:::::W W:::::W        N::::::N   N:::::::::::N");
        wait(70);
        System.out.println(" D:::::D     D:::::D   A:::::::::::::::::::::A  W:::::W:::::W   W:::::W:::::W         N::::::N    N::::::::::N");
        wait(70);
        System.out.println(" D:::::D    D:::::D   A:::::AAAAAAAAAAAAA:::::A  W:::::::::W     W:::::::::W          N::::::N     N:::::::::N");
        wait(70);
        System.out.println("DDD:::::DDDDD:::::D  A:::::A             A:::::A  W:::::::W       W:::::::W           N::::::N      N::::::::N");
        wait(70);
        System.out.println("D:::::::::::::::DD  A:::::A               A:::::A  W:::::W         W:::::W            N::::::N       N:::::::N");
        wait(70);
        System.out.println("D::::::::::::DDD   A:::::A                 A:::::A  W:::W           W:::W             N::::::N        N::::::N");
        wait(70);
        System.out.println("DDDDDDDDDDDDD     AAAAAAA                   AAAAAAA  WWW             WWW              NNNNNNNN         NNNNNNN");
        wait(70);
        
        System.out.println("");
        wait(70);
        System.out.println("=======================================================");
        wait(70);
        System.out.println("############## Created by: Preston Daily ##############");
        wait(70);
        System.out.println("=======================================================");
        wait(70);
        
        System.out.println("");
        wait(70);
       
        System.out.println("");
        wait(70);
        System.out.println("\n");
        wait(70);
        wait(300);
        System.out.print("Type your name: ");
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
        
        
        
                // STAT CHECK
        
        //String stat_check = user_input.next();
       
        /*
        String lowerCheck = user_input.next().toLowerCase();  
        
        
        
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
                System.out.println("");
                
                lowerCheck = (user_input.next()).toLowerCase();
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
                System.out.println("");
                
                lowerCheck = (user_input.next()).toLowerCase();
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
        
                    System.out.print(inventory[i]);
        
                }
                // =======================End=========================
                
                System.out.println("");
                System.out.println("-------------------------------------------------");
                System.out.println("");
                
                lowerCheck = (user_input.next()).toLowerCase();
            }
        }
        
        
        // END OF STAT CHECK SITUATION
        
        */
        
        //new question break-----------------------
        for (int i = 0; i <= 40; i++){
           System.out.println("\n");
        }    
        //new question break-----------------------
        
        System.out.println("You awake...");
        wait(170);
        System.out.println("Attempting to recollect");
        wait(170);
        System.out.println("your thoughts, you panic in");
        wait(170);
        System.out.println("the realization that you cannot");
        wait(170);
        System.out.println("remember the past.");
        
        wait(6000);
        
        System.out.println("");
        wait(170);
        System.out.println("Finding yourself in a cold,");
        wait(170);
        System.out.println("dark, and rather damp corridor.");
        wait(170);
        System.out.println("The only visible light, permiates from");
        wait(170);
        System.out.println("a door several paces away.");
        wait(170);
        System.out.println("You notice a crate next to you.");
        wait(170);
        System.out.println("It is emitting a strange sound.");
        
        wait(7200);
        
        
        System.out.println("\n");
        
        System.out.println("Do you go down the 'corridor'? Or inspect the 'crate'?");
        
        
        corridorOrCrate();
        
        
        
    }
    public void corridorOrCrate(){
        
        
        String[] firstOption = {"corridor"};
        String[] altfirstOption = {"crate"};
        
        String firstChoice = user_input.next();
        
        for (String a: firstOption)
        {
            if (a.toLowerCase().contains(firstChoice))
            {
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                
                
                
                
                System.out.println("\n");
                System.out.println("Venturing down the dank");
                
                System.out.println("corridor, your surroundings");
                
                System.out.println("grow brighter and brighter");
                
                System.out.println("as you travel closer to the door.");
                wait(4200);
                
                System.out.println("");
                System.out.println("(traveling)");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.println("");
                System.out.println("");
                
                System.out.println("Arriving at the door, you");
                System.out.println("see a large vertical lever.");
                System.out.println("(possibly to open the door)");
                
                
                oppeningDoorOrInspect();
                
                
            }  
        }
        for (String b: altfirstOption)
        {
            if (b.toLowerCase().contains(firstChoice)){
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                
                System.out.println("\n");
                System.out.println("Upon further inspection");
                System.out.println("you see a handle for the");
                System.out.println("openning of the crate.");
                
                
                openOrCorridor();
                
                
            }
        }
    }
    
    public void openOrCorridor(){
        
    
        System.out.println("\n");
        System.out.println("Do you 'open' the crate?");
        System.out.println("Or do you decide to go");
        System.out.println("down the 'corridor'?");
        
        String[] secondOption = {"open"};
        String[] altsecondOption = {"corridor"};
        
        String secondChoice = user_input.next();
        
        for (String a: secondOption){
            if (a.toLowerCase().contains(secondChoice)){
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                System.out.println("");
                System.out.println("(openning)");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.println("");
                System.out.println("");
               
                
                System.out.println("The crate is filled with");
                System.out.println("a putrid rotting collection");
                System.out.println("of canibalistic rodents");
                
                System.out.println("\n");
                System.out.println("Do you jump in the crate to");
                System.out.println("'play' with these rodents?");
                System.out.println("");
                System.out.println("Or do you reluctantly travel");
                System.out.println("towards the glowing door located");
                System.out.println("further down the 'corridor'?");
                
                
                
                String[] cORsOption = {"play"};
                String[] altcORsOption = {"corridor"};
                
                String corridorSuicideChoice = user_input.next();
                
                
                for (String c: cORsOption){
                    if (c.toLowerCase().contains(corridorSuicideChoice)){
                        System.out.println("");
                        System.out.println("(climbing in!)");
                        wait(1500);
                        System.out.print(". ");
                        wait(1500);
                        System.out.print(". ");
                        wait(1500);
                        System.out.print(". ");
                        wait(1500);
                        System.out.println("");
                        System.out.println("");
                        
                        
                        System.out.println("You enjoy a lofty 2 minutes");
                        System.out.println("in the crate untill you are");
                        System.out.println("nawed to death by the rodents.");
                        wait(3500);
                        System.out.println("");
                        System.out.println("GAME OVER");
                        
                    }
                }
                for (String d: altcORsOption){
                    if (d.toLowerCase().contains(corridorSuicideChoice)){
                        corridorMinusCrate();
                    }
                }
                
            }
        }
        for (String b: altsecondOption){
            if (b.toLowerCase().contains(secondChoice)){
                corridorMinusCrate();
            }
        }
    
        
    }
    public void corridorMinusCrate(){
        
        //new question break-----------------------
        for (int i = 0; i <= 4; i++){
           System.out.println("========================================================================");
        }    
        //new question break-----------------------
        System.out.println("\n");
        System.out.println("Venturing down the dank");
        
        System.out.println("corridor, your surroundings");
        
        System.out.println("grow brighter and brighter");
        
        System.out.println("as you travel closer to the door.");
        wait(4200);
                
        System.out.println("");
        System.out.println("(traveling)");
        wait(1500);
        System.out.print(". ");
        wait(1500);
        System.out.print(". ");
        wait(1500);
        System.out.print(". ");
        wait(1500);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Arriving at the door, you");
        System.out.println("see a large vertical lever.");
        System.out.println("(possibly to open the door)");
        System.out.println("");
                
                
        oppeningDoorOrInspect();
                
                
    }
    public void oppeningDoorOrInspect(){
        
        
        System.out.println("");
        System.out.println("Do you 'open' the door?");
        System.out.println("Or do you 'inspect' it?");
        
        
        String[] thirdOption = {"open"};
        String[] altthirdOption = {"inspect"};
        
        String thirdChoice = user_input.next();
        
        for (String a: thirdOption){
            if (a.toLowerCase().contains(thirdChoice)){
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                
                
                oppeningDoorVinilla();
                
            }
        }
        for (String b: altthirdOption){
            if (b.toLowerCase().contains(thirdChoice)){
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                
                System.out.println("Further inspecting the door");
                System.out.println("you notice that the once");
                System.out.println("permiating light has fadded.");
                System.out.println("You can faintly hear murmurs");
                System.out.println("of more than just one voice.");
                
                System.out.println("");
                
                System.out.println("Do you 'search' for a weapon in the corridor?");
                System.out.println("Or do you try to 'talk' to them?");
                
                searchOrTalk();
                
            }
        }
    } 
    public void equipingItem(){
        
        String[] fifthOption = {"/equip1"};
        String[] altfifthOption = {"/equip2"};
        
        String fifthChoice = user_input.next();
        for (String a: fifthOption){
            if (a.toLowerCase().contains(fifthChoice)){
                wait(2000);
                System.out.println("");
                System.out.println("(equipping)");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.println("");
                
                System.out.println("");
                System.out.println("You equip the Pencil.");
                System.out.println("");
                
                creatureAttacking();
            }
        }
        for (String a: altfifthOption){
            if (a.toLowerCase().contains(fifthChoice)){
                wait(2000);
                System.out.println("");
                System.out.println("(equipping)");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.println("");
                
                System.out.println("");
                System.out.println("You equip the Necklace.");
                System.out.println("");
                
                creatureAttacking();
                
            }
        }
    }
    public void searchOrTalk(){
        
        
        String[] fourthOption = {"search"};
        String[] altfourthOption = {"talk"};
        
        String fourthChoice = user_input.next();
        
        for (String a: fourthOption){
            if (a.toLowerCase().contains(fourthChoice)){
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                
                searchingBeforeDoor1();
                
                
                    }
                }
            
        
        for (String b: altfourthOption){
            if (b.toLowerCase().contains(fourthChoice)){
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                
                
                wait(1200);
                System.out.println("");
                System.out.println("");
                System.out.println("You shout at the top of your lungs,");
                System.out.println("'" + "Hello?!" + "'..(* BAM! *)");
                wait(1000);
                System.out.println("(your shouting is cut short)");
                wait(2500);
                System.out.print("...you get no reply.");
                System.out.println("");
                wait(2000);
                
                
                openDoorOrSearch();
                
                
            }
        }
    }
    public void oppeningDoorVinilla(){
            System.out.println("");
            System.out.println("(openning)");
            wait(1500);
            System.out.print(". ");
            wait(1500);
            System.out.print(". ");
            wait(1500);
            System.out.print(". ");
            wait(1500);
            System.out.println("");
            System.out.println("");
                
                
            System.out.println("You open the door making");
            System.out.println("an extremely loud noise.");
            wait(3500);
            System.out.println("As you enter, you are AMBUSHED!");
            wait(2800);
            System.out.println("One of the two humanoid creatures");
            System.out.println("hits you with their fist, injuring you.");
            wait(4500);
            health(-15);
            wait(3000);
            System.out.println("(See what you can equip!)");
                
                
            System.out.println("\n");
            System.out.println("");
            System.out.println("-------------Your Inventory Includes-------------");
            System.out.println("");
                
            int itemAmount = 2;
                // ==================Inventory Print==================
            String[] inventory = {"Pencil", "Necklace"}; 
                    
            for (int i = 0; i <= (itemAmount - 1); i++){
        
                    int number = i + 1;
                    System.out.println(number + ": " + inventory[i]);
        
            }
            // =======================End=========================
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("");
            System.out.println("(type '/equip' with the corresponding number of the item you want to equip.)");
            System.out.println("(Example: '/equip1')");
                
            equipingItem();
                

    }
    public void openDoorOrSearch(){
        
        System.out.println("");
        System.out.println("");
        System.out.println("Forcefully 'open' the door?");
        System.out.println("Or 'search' for a weapon?");
        System.out.println("");
                
        
        String[] sixthOption = {"open"};
        String[] altsixthOption = {"search"};
     
        String sixthChoice = user_input.next();
                
        for (String a: sixthOption){
            if (a.toLowerCase().contains(sixthChoice)){
                        
                oppeningDoorVinilla();
                            
            }
                }
        for (String b: altsixthOption){
            if (b.toLowerCase().contains(sixthChoice)){
                        
                searchingBeforeDoor1();
                            
            }
        }
    }
    public void searchingBeforeDoor1(){
     
                System.out.println("You attempt to search for a weapon");
                System.out.println("in the blackness of the corridor.");
                wait(1200);
                System.out.println("");
                System.out.println("(searching)");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.print(". ");
                wait(1500);
                System.out.println("");
                System.out.println("");
                System.out.println("You find a Sharpened stick.");
                System.out.println("Put it in your inventory? ('yes'/'no') ");
                
                String[] ye = {"yes"};
                String[] nah = {"no"};
                String inventoryIt = user_input.next();
                for (String c: ye){
                    if (c.toLowerCase().contains(inventoryIt)){
                        System.out.println("Your inventory is updated!");
                        System.out.println("\n");
                        System.out.println("");
                        System.out.println("-------------Your Inventory Includes-------------");
                        System.out.println("");
                
                        int itemAmount = 3;
                        // ==================Inventory Print==================
                        String[] inventory = {"Pencil", "Necklace", "Sharpened stick"}; 
                        
                        for (int i = 0; i <= (itemAmount - 1); i++){
                            
                            int number = i + 1;
                            System.out.println(number + ": " + inventory[i]);
                            
                        }
                        // =======================End=========================
                        System.out.println("");
                        System.out.println("-------------------------------------------------");
                        System.out.println("");
                        System.out.println("\n");
                        //new question break-----------------------
                        for (int i = 0; i <= 4; i++){
                            System.out.println("========================================================================");
                        }    
                        //new question break-----------------------
                        
                        entranceAfterSearching();
                        
                      
                    }
                }
                for (String d: nah){
                    if (d.toLowerCase().contains(inventoryIt)){
                        System.out.println("You continue your search");
                        System.out.println("through the fowl smelling sludge");
                        System.out.println("linning a cold, damp rock.");
                        wait(1200);
                        System.out.println("");
                        System.out.println("(searching)");
                        wait(1500);
                        System.out.print(". ");
                        wait(1500);
                        System.out.print(". ");
                        wait(1500);
                        System.out.print(". ");
                        wait(1500);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("You miraculously find a Steel Sword!");
                        System.out.println("You put it in your inventory.");
                        wait(3200);
                        System.out.println("");
                        System.out.println("(storing)");
                        wait(500);
                        System.out.print(". ");
                        wait(500);
                        System.out.print(". ");
                        wait(500);
                        System.out.print(". ");
                        wait(500);
                        System.out.println("");
                        System.out.println("");
                        
                        System.out.println("Your inventory is updated!");
                        System.out.println("\n");
                        System.out.println("");
                        System.out.println("-------------Your Inventory Includes-------------");
                        System.out.println("");
                
                        int itemAmount = 3;
                        // ==================Inventory Print==================
                        String[] inventory = {"Pencil", "Necklace", "Steel Sword"}; 
                        
                        for (int i = 0; i <= (itemAmount - 1); i++){
                            
                            int number = i + 1;
                            System.out.println(number + ": " + inventory[i]);
                            
                        }
                        // =======================End=========================
                        System.out.println("");
                        System.out.println("-------------------------------------------------");
                        System.out.println("");
                        System.out.println("\n");
                        //new question break-----------------------
                        for (int i = 0; i <= 4; i++){
                            System.out.println("========================================================================");
                        }    
                        //new question break-----------------------
                        
                        entranceAfterSearching();
                        
                    }
                }
    }            

    public void creatureAttacking(){
        
        int pHealth = 100;
        
        for (int i = 100; i > 0;){
            
            int pDamage = rollDice(5, 6);
            int mDamage = rollDice(4, 6);
        
            System.out.println("Do you 'block' its attack?");
            System.out.println("Or do you 'attack' it?");
            String combatChoice = user_input.next();
            
            
            if ((combatChoice).equals("block")){
                System.out.println("You block the creatures");
                System.out.println("attack leaving it vunruble.");
                System.out.println("");
                System.out.println("Do you 'attack'?");
                String combatFromBlock = user_input.next();
                if ((combatFromBlock).equals("attack")){
                    System.out.println("You attack the creature");
                    System.out.println("dealing " + pDamage + " damage.");
                    System.out.println("");
                }
            } else if ((combatChoice).equals("attack")){
                System.out.println("You attack the creature");
                System.out.println("and the creature attacks you!");
                System.out.println("You deal " + pDamage + " damage!");
                System.out.println("You loose " + mDamage + " health!");
                System.out.println("");
                pHealth = pHealth - mDamage;
            }
            
            i = i - pDamage;
            
            System.out.println("(Creature health: " + i + ")");
            System.out.println("(Your health: " + pHealth + ")");
            wait(4500);
            System.out.println("");
            System.out.println("");
            if (pHealth <= 0){
                youLose();
            } else if ((pHealth >= 1) && (i >= 1)){
                System.out.println("The creature again starts to attack.");
            }
            
            pDamage = 0;
            pDamage = rollDice(5, 6);
            mDamage = 0;
            mDamage = rollDice(4, 6);
        }
        for(int i = 0; i < 50; i++){
            System.out.println("\n");
        }
        
       
        System.out.println("");
        System.out.println("");
        System.out.println("The creature to your left");
        System.out.println("now begins to attack you!");
        wait(4500);
        System.out.println("");
        
        
        for (int i = 100; i > 0;){
             
            int pDamage = rollDice(5, 6);
            int mDamage = rollDice(4, 6);
        
            System.out.println("Do you 'block' its attack?");
            System.out.println("Or do you 'attack' it?");
            String combatChoice = user_input.next();
            
            
            if ((combatChoice).equals("block")){
                System.out.println("You block the creatures");
                System.out.println("attack leaving it vunruble.");
                System.out.println("");
                System.out.println("Do you 'attack'?");
                String combatFromBlock = user_input.next();
                if ((combatFromBlock).equals("attack")){
                    System.out.println("You attack the creature");
                    System.out.println("dealing " + pDamage + " damage.");
                    System.out.println("");
                }
            } else if ((combatChoice).equals("attack")){
                System.out.println("You attack the creature");
                System.out.println("and the creature attacks you!");
                System.out.println("You deal " + pDamage + " damage!");
                System.out.println("You loose " + mDamage + " health!");
                System.out.println("");
                pHealth = pHealth - mDamage;
            }
            
            i = i - pDamage;
            
            System.out.println("(Creature health: " + i + ")");
            System.out.println("(Your health: " + pHealth + ")");
            wait(4500);
            System.out.println("");
            System.out.println("");
            if (pHealth <= 0){
                youLose();
            } else if ((pHealth >= 1) && (i >= 1)){
                System.out.println("The creature again starts to attack.");
            }
            
            pDamage = 0;
            pDamage = rollDice(5, 6);
            mDamage = 0;
            mDamage = rollDice(4, 6);
        }
        for(int i = 0; i < 50; i++){
            System.out.println("\n");
        }
        
        youWin();
        
    }
    
    
    public void entranceAfterSearching(){
        System.out.println("");
        System.out.println("");
        System.out.println("Do you 'forcibly' bust into the room?");
        System.out.println("Or do you 'slowly' open the door?");
        
        
        String[] seventhOption = {"forcibly"};
        String[] altseventhOption = {"slowly"};
        
        String seventhChoice = user_input.next();
        
        for (String a: seventhOption){
            if (a.toLowerCase().contains(seventhChoice)){
                wait(1000);
                System.out.println("");
                System.out.println("(busting in)");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.println("");
                System.out.println("");
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                System.out.println("");
                System.out.println("");
                System.out.println("Startling two humanoid");
                System.out.println("creatures begin to attack");
                System.out.println("you with their bare fists!");
                System.out.println("The one on the right attacks first!");
                System.out.println("");
                System.out.println("");
                
                
                combatHumanoids();
                
                
            }
        }
        for (String a: altseventhOption){
            if (a.toLowerCase().contains(seventhChoice)){
                wait(1000);
                System.out.println("");
                System.out.println("(slowly openning)");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.print(". ");
                wait(500);
                System.out.println("");
                System.out.println("");
                //new question break-----------------------
                for (int i = 0; i <= 4; i++){
                    System.out.println("========================================================================");
                }    
                //new question break-----------------------
                System.out.println("");
                System.out.println("");
                System.out.println("Startling two humanoid");
                System.out.println("creatures they begin to pursue");
                System.out.println("you with their bare fists!");
                System.out.println("");
                System.out.println("");
                System.out.println("The creature on your right");
                System.out.println("begins to swing!");
                System.out.println("");
        
                
                
                combatHumanoids();
                
                
            }
        }
    }
    public void combatHumanoids(){
        
        int pHealth = 100;
        
        
        for (int i = 100; i > 0;){
            
             
            int pDamage = rollDice(10, 6);
            int mDamage = rollDice(4, 6);
        
            System.out.println("Do you 'block' its attack?");
            System.out.println("Or do you 'attack' it?");
            String combatChoice = user_input.next();
            
            
            if ((combatChoice).equals("block")){
                System.out.println("You block the creatures");
                System.out.println("attack leaving it vunruble.");
                System.out.println("");
                System.out.println("Do you 'attack'?");
                String combatFromBlock = user_input.next();
                if ((combatFromBlock).equals("attack")){
                    System.out.println("You attack the creature");
                    System.out.println("dealing " + pDamage + " damage.");
                    System.out.println("");
                }
            } else if ((combatChoice).equals("attack")){
                System.out.println("You attack the creature");
                System.out.println("and the creature attacks you!");
                System.out.println("You deal " + pDamage + " damage!");
                if (mDamage <= -1){
                
                }
                System.out.println("You lose " + mDamage + " health!");
                System.out.println("");
                pHealth = pHealth - mDamage;
            }
            
            i = i - pDamage;
            
            System.out.println("(Creature health: " + i + ")");
            System.out.println("(Your health: " + pHealth + ")");
            wait(4500);
            System.out.println("");
            System.out.println("");
            if (pHealth <= 0){
                youLose();
            } else if ((pHealth >= 1) && (i >= 1)){
                System.out.println("The creature again starts to attack.");
            }
            
            pDamage = 0;
            pDamage = rollDice(10, 6);
            mDamage = 0;
            mDamage = rollDice(4, 6);
        }
        for(int i = 0; i < 50; i++){
            System.out.println("\n");
        }
        
       
        System.out.println("");
        System.out.println("");
        System.out.println("The creature to your left");
        System.out.println("now begins to attack you!");
        wait(4500);
        System.out.println("");
        
        
        for (int i = 100; i > 0;){
                    
             
            int pDamage = rollDice(10, 6);
            int mDamage = rollDice(4, 6);
        
            System.out.println("Do you 'block' its attack?");
            System.out.println("Or do you 'attack' it?");
            String combatChoice = user_input.next();
            
            
            if ((combatChoice).equals("block")){
                System.out.println("You block the creatures");
                System.out.println("attack leaving it vunruble.");
                System.out.println("");
                System.out.println("Do you 'attack'?");
                String combatFromBlock = user_input.next();
                if ((combatFromBlock).equals("attack")){
                    System.out.println("You attack the creature");
                    System.out.println("dealing " + pDamage + " damage.");
                    System.out.println("");
                }
            } else if ((combatChoice).equals("attack")){
                System.out.println("You attack the creature");
                System.out.println("and the creature attacks you!");
                System.out.println("You deal " + pDamage + " damage!");
                System.out.println("You loose " + mDamage + " health!");
                System.out.println("");
                pHealth = pHealth - mDamage;
            }
            
            i = i - pDamage;
            
            System.out.println("(Creature health: " + i + ")");
            System.out.println("(Your health: " + pHealth + ")");
            wait(4500);
            System.out.println("");
            System.out.println("");
            if (pHealth <= 0){
                youLose();
            } else if ((pHealth >= 1) && (i >= 1)){
                System.out.println("The creature again starts to attack.");
            }
            
            pDamage = 0;
            pDamage = rollDice(10, 6);
            mDamage = 0;
            mDamage = rollDice(4, 6);
        }
        for(int i = 0; i < 50; i++){
            System.out.println("\n");
        }
        
        youWin();
        
    }
    
    public void youWin(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Congrats!");
        System.out.println("\n");
        System.out.println("\n");
        
        wait(3500);
        
        for (int i = 0; i <= 40000000; i++){
            System.out.println("========================================================================================================================================================================================================================================================================================================================================");
        }    
    }
    public void youLose(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("You Die!");
        System.out.println("(Game over)");
        System.out.println("\n");
        System.out.println("\n");
        
        wait(3500);
        
        for (int i = 0; i <= 40000000; i++){
            System.out.println("========================================================================================================================================================================================================================================================================================================================================");
        }    
    
    }
}

