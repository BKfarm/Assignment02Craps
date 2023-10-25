import java.util.*;

public class Ass02
{
    public static void main(String[] args)
    {
        int die1 = 0;
        int die2 = 0;
        int crapsRoll = 0;
        Scanner in = new Scanner(System.in);
        Random rnd = new Random(); // create a Random object called rnd.
        boolean done = false;
        boolean finished = false;
    do{
        finished = false;
        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
        crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice
        System.out.println("You rolled a " + die1 + " and a " + die2 + "!");
        System.out.println("That's " + crapsRoll + ".");
    if ((crapsRoll < 4) || (crapsRoll == 12) || (crapsRoll == 7) || (crapsRoll == 11))
    { 
        if ((crapsRoll < 4) || (crapsRoll == 12))
        System.out.println("You crapped out.");
        else
        System.out.println("You rolled a natural result! You Win!");    
    } else {
    do{
        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
        System.out.println("You rolled a " + die1 + " and a " + die2 + "!");
        if(crapsRoll == die1 + die2){
        System.out.println("You rolled a match! You Win!");
            finished = true;
        } else if((die1+die2) == 7){
            System.out.println("You crapped out.");
            finished = true;
        }
    }while(!finished);
    
    
    }
    done = SafeInput.getYNConfirm(in, "Continue? [Y/N]");
    }while(done);
    }
}