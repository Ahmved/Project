// أحمد عبدالرحمن الأحمدي
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        while (true) {
          System.out.print("Enter your choice (rock, paper, or scissors): ");
          String userChoice = input.nextLine().toLowerCase();

          // Generate a random choice for the computer
          int computerChoiceNumber = (int) (Math.random() * 3);
          String computerChoice;
          if (computerChoiceNumber == 0) {
            computerChoice = "rock";
          } else if (computerChoiceNumber == 1) {
            computerChoice = "paper";
          } else {
            computerChoice = "scissors";
          }

          System.out.println("You chose " + userChoice + ".");
          System.out.println("The computer chose " + computerChoice + ".");

          // Determine the winner
          if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
          } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                  || (userChoice.equals("paper") && computerChoice.equals("rock"))
                  || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
          } else {
            System.out.println("The computer wins!");
          }

          System.out.print("Do you want to play again? (y/n): ");
          String playAgain = input.nextLine().toLowerCase();
          if (!playAgain.equals("y")) {
            break;
          }
        }
    }

    System.out.println("Thanks for playing!");
  }
}