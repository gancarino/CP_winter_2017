package pl.waw.sgh.Hangman;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {

    public static void main(String[] args) throws IOException {
        //How do we play the game
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman game! I will pick a word and you will "
                + "try to guess it character "
                + "by typing in a character. "
                + "If you guess wrong 6 times, then I win.\n If you can guess it before then, you win. "
                + "Are you ready? \n I hope so because I am!");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below "
                + " that is your current guess, which starts off as nothing. \nEvery time you"
                + " guess incorrectly. I add a body part to the picture. When there is full "
                + " person, you lose.");
        //Alows for multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay)  {
            System.out.println();
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();

            do {
                //Draw the things
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();

                //Get the guess
                System.out.println("Enter a character that you think is in the word");
                char guess = (sc.next().toLowerCase().charAt(0));
                System.out.println();

                // Check if the character is guessed already
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! You've already guessed that character.");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }

                //Play the gues

                if (game.playGuess(guess)) {
                    System.out.println("Great guess! That haracter is in the word");
                } else {
                    System.out.println("Unfortunately that character isn't in the word");
                }
            }



            while (!game.gameOver()); //Keep playing util game is over

            // Playing again or no

            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (sc.next().toUpperCase().charAt(0));
            doYouWantToPlay = (response == 'Y');
        }
    }
}