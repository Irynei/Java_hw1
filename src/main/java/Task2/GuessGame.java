package Task2;

import javax.swing.*;
import java.util.Random;


public class GuessGame {
    private int guessNumber;
    private double bestScore = 0.0;
    private double attemptCount = 0;

    public void play(int max) {
        System.out.println(String.format("Max number is (%d)", max));
        this.generateGuessNumber(max);

        while(true){
            this.attemptCount++;
            int userAnswer = getUserAnswer();

            if(userAnswer == this.guessNumber) {
                System.out.println("Congratulations! You guessed the number!");
                calculateBestScore(max);
                break;
            } else if (userAnswer < this.guessNumber){
                System.out.println(String.format("Your number (%d) is smaller", userAnswer));
            } else {
                System.out.println(String.format("Your number (%d) is greater", userAnswer));
            }
        }
    }

    public void printBestScore(){
        System.out.println(String.format("Your best score is: %.3f", this.bestScore));
    }

    private void generateGuessNumber(int max) {
        Random random = new Random();
        this.guessNumber = random.nextInt(max);
    }

    private void calculateBestScore(int maxNumber) {
        double currentScore = maxNumber / this.attemptCount;
        if(currentScore > this.bestScore) {
            this.bestScore = currentScore;
        }
    }

    private int getUserAnswer() {
        return Integer.parseInt(JOptionPane.showInputDialog("Your guess: "));
    }
}
