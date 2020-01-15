
/**
 * Plays the game craps!!!!!!!!!!!!!!!!!!!!!!!!!!
 *
 * @author Lucas Arango
 * @version 1-15-2020
 */

import java.util.Scanner;

public class Craps
{
    public static void giveInstructions(Scanner in)
    {
        System.out.println("Would you like instructions on how to play Craps (Y/n)?");
        String play = in.nextLine();
        if (play.equals("") || play.substring(0, 1).equalsIgnoreCase("y"))
        {
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically" + "\n" + 
            "loses,and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
            System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the" + "\n" +
            "point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("The Game of Craps...");
        Scanner in = new Scanner(System.in);
        giveInstructions(in);
        Die d1 = new Die();
        Die d2 = new Die();
        d1.roll();
        d2.roll();
        int roll1 = d1.getResult() + d2.getResult();
        
    }
    
}
