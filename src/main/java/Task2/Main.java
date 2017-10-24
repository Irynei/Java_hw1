package Task2;

import javax.swing.*;

public class Main {
    public static void main(String [] args) {
        GuessGame game = new GuessGame();
        while (true) {
            int max = Integer.parseInt(JOptionPane.showInputDialog("Specify max number for GuessGame"));
            game.play(max);
            game.printBestScore();
            // play one more time or not
            int reply = JOptionPane.showConfirmDialog(
                    null,
                    "Want to play one more time?",
                    "GuessGame",
                    JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_NO_OPTION) {
                int maxNumber = Integer.parseInt(JOptionPane.showInputDialog("Specify max number for GuessGame"));
                game.play(maxNumber);
                game.printBestScore();
            } else {
                break;
            }
        }
    }
}