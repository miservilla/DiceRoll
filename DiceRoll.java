import java.util.Scanner;

/**
 * Created by miser on 9/8/2016.
 */
public class DiceRoll {

    public static void main(String[] args){

        int pigPlayer1 = 0;
        int pigPlayer2 = 0;
        int playerCounter = 0;
        int turnTotal = 0;

        while (pigPlayer1 <100 || pigPlayer2 < 100) {
            System.out.println("\nScore: " + pigPlayer1 + "-" + pigPlayer2 + ".");
            playerCounter++;

            if (playerCounter % 2 == 0) {
                System.out.println("\nPig player 2's turn.");
                turnTotal = PlayerRoll();
                pigPlayer2 += turnTotal;
            } else {
                System.out.println("\nPig player 1's turn.");
                turnTotal = PlayerRoll();
                pigPlayer1 += turnTotal;
            }
        }

    }
    public static int PlayerRoll() {
        Scanner scanIn = new Scanner(System.in);
        String playAgain = "Y";
        int turnTotal = 0;
        while (playAgain.equalsIgnoreCase("Y")) {
            int rollAmount = RandomNumber();
            System.out.println("You rolled a " + rollAmount + ".");
            if (rollAmount == 1) {
                turnTotal = 0;
                playAgain = "N";
                System.out.println("Your total this turn is " + turnTotal + ".");
                return turnTotal;
            } else turnTotal += rollAmount;
            System.out.println("Your total this turn is " + turnTotal + ".");
            System.out.println("Roll again (y/n): ");
            playAgain = scanIn.next();
            }
        return turnTotal;
    }
    //Method to generate random number.
    public static int RandomNumber () {
        int rand = (int) (Math.random() * 6) + 1;
            return rand;
        }
    }
