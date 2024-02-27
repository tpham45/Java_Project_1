import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        String[] rps = {"r","p","s"};
        String computerMove = rps [new Random().nextInt(rps.length)];

        String playerMove;

        while(true) {
        System.out.println("Please enter your move (r,p, or s)");
        playerMove = scanner.nextLine().toLowerCase();
        if (playerMove.equals ("r") || playerMove.equals("p") || playerMove.equals("s")) {
            break;
            }
        System.out.println(playerMove + " is not a valid value.");
        }

        System.out.println("Computer Played: " +computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("Lucky! you are not lose :D");    
        } 

        else if (
                    (playerMove.equals("r") && computerMove.equals("s")) || 
                    (playerMove.equals("s") && computerMove.equals("p")) ||
                    (playerMove.equals("p") && computerMove.equals("r"))
                ) {
            System.out.println ("You win! :>");
        }

        else {
            System.out.println("You lose! :<");
        }

        System.out.println("Do you want to play game again? (y/n)");
        String playAgain = scanner.nextLine().toLowerCase();

        if (!playAgain.equals("y")) {
            break;
        }
        }
    }
}