import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int numberOfAttempts = 0;
            int numberOfRounds = 0;
            int score = 0;

         while (true) {
            numberOfAttempts = 0;
            int randomNumber = random.nextInt(100) + 1;
                  while (true) {
                System.out.println("Enter your guess (1-100):");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += numberOfAttempts;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }

                if (numberOfAttempts >= 7) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
                    break;
                }
            }

                   numberOfRounds++;
                   System.out.println("Would you like to play again? (yes/no)");
                   String playAgain = scanner.next();
                     if (!playAgain.equalsIgnoreCase("yes")) {
                       System.out.println("Thank you for playing! Your final score is " + score + ".");
                       break;
                    } else {
                        System.out.println("");}
        }   
    }
}