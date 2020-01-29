
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
        System.out.println("Let's play the Game of Craps!");
        String playStatus = "y";
        while (playStatus.equals("") || playStatus.equals("y"))
        {
            System.out.println("Press <Enter> to play the game!");
            in.nextLine();
            Die d1 = new Die();
            Die d2 = new Die();
            int result1 = d1.roll();
            int result2 = d2.roll();
            int roll1 = result1 + result2;
            System.out.println("You rolled a " + result1 + " and a " + result2 + " for a total of " + roll1);
            if (roll1 == 7 || roll1 == 11)
            {
                System.out.println("You win!");
            }
            else if (roll1 == 2 || roll1 == 3 || roll1 == 12)
            {
                System.out.println("You lose!");
            }
            else
            {
                int point = roll1;
                System.out.println("Your point is " + point + ", roll again!");
                System.out.println("Press <Enter> to roll.");
                in.nextLine();
                boolean rollAgain = true;
                while (rollAgain)
                {
                    int result3 = d1.roll();
                    int result4 = d2.roll();
                    int roll2 = result3 + result4;
                    System.out.println("You rolled a " + result3 + " and a " + result4 + " for a total of " + roll2);
                    if (roll2 == point)
                    {
                        System.out.println("You win!"); 
                        rollAgain = false;
                    }
                    else if (roll2 == 7)
                    {
                        System.out.println("You lose!");
                        rollAgain = false;
                    }
                    else
                    {
                        System.out.println("Press <Enter> to roll.");
                        in.nextLine();
                    }
                }
            }
            System.out.println("Would you like to play again? (Y/n)");
            playStatus = in.nextLine();
        }
        System.out.println("Thank you for playing the Game of Craps!");
    }
}
