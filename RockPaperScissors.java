import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");

        Scanner reader = new Scanner(System.in);
        String playerMove = reader.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = "Rock";
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = "Paper";
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = "Scissors";
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);

        String computerMove = "";
        switch (computerRandomNumber + 1) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
            default:
                System.out.println("Invalid Computer Input");
        }

        System.out.printf("The computer chose %s.%n", computerMove);

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("You win.");
        } else if((playerMove.equals("Rock") && computerMove.equals("Paper")) ||
                (playerMove.equals("Paper") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Rock"))) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }
    }
}