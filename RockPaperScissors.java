import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        System.out.println("Chose: [stop] - to end the game");
        System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");

        Scanner reader = new Scanner(System.in);
        String playerMove = reader.nextLine();

        int myScore = 0;
        int computerScore = 0;

        while (!playerMove.equals("stop")) {

            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = "Rock";
            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = "Paper";
            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = "Scissors";
            } else {
                System.out.println("Invalid Input. Try Again...");
                System.out.println();
                System.out.println("Chose: [stop] - to end the game");
                System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
                playerMove = reader.nextLine();
                continue;
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
                myScore++;
                System.out.printf("My Score: %d%n", myScore);
                System.out.printf("Computer Score: %d%n", computerScore);
                System.out.println();
            } else if((playerMove.equals("Rock") && computerMove.equals("Paper")) ||
                    (playerMove.equals("Paper") && computerMove.equals("Scissors")) ||
                    (playerMove.equals("Scissors") && computerMove.equals("Rock"))) {
                System.out.println("You lose.");
                computerScore++;
                System.out.printf("My Score: %d%n", myScore);
                System.out.printf("Computer Score: %d%n", computerScore);
                System.out.println();
            } else {
                System.out.println("This game was a draw.");
                myScore++;
                computerScore++;
                System.out.printf("My Score: %d%n", myScore);
                System.out.printf("Computer Score: %d%n", computerScore);
                System.out.println();
            }

            System.out.println("Chose: [stop] - to end the game");
            System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
            playerMove = reader.nextLine();
        }
    }
}