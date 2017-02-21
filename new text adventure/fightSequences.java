
/**
 * Write a description of class fightSequences here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fightSequences extends allUfGam
{
    
    String yB = ("You successfully block!");
    String nB = ("You fail to block!");
    String yA = ("You successfully attack!");
    String nA = ("You fail to attack!");
    String pH = ("You have been it!");
        
    
    
    public void searchedfightSequenceRightMonster(int health, int weapon){
        int rightMonster = 100;
        
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
            
        int creatureDamage = die1 + die2;
            
            
            
        die3 = (int)(Math.random()*6) + 1;
        die4 = (int)(Math.random()*6) + 1;
            
        int playerDamage = die3 + die4 + 5;
        
        
        
        
        wait(3500);
        System.out.println("Do you attempt to block?");
        System.out.println("Or do you counter-'attack'?");
        
        String[] combatOption = {"block"};
        String[] altcombatOption = {"attack"};
        
        String combatChoice = user_input.next();
        
        for (String a: combatOption){
            
            if (a.toLowerCase().contains(combatChoice)){
                
                
                if (die1 >= die2){
                    System.out.println(yB);
                    System.out.println("");
                    if (health > 0){
                        searchedfightSequenceRightMonster();
                    } else {
                        System.out.println("You died!");
                        System.out.println("GAME OVER");
                    }
                }
                if (die1 < die2){
                    System.out.println(nB);
                    health = health - creatureDamage;
                    if (health > 0){
                        searchedfightSequenceRightMonster();
                    } else {
                        System.out.println("You died!");
                        System.out.println("GAME OVER");
                    }
                }
            }
        }
        
        
        
        
                
                
        
        
    }
}
