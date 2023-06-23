/*package Final;

import javax.swing.*;
import java.awt.*;

public class GameWindow {

    private JFrame frame;
    private Player player1;
    private Player player2;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea resultArea;
    private JButton rollButton1;
    private JButton rollButton2;

    public GameWindow() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");

        frame = new JFrame("Cubilete Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        rollButton1 = new JButton("Player 1 Roll Dice");
        rollButton2 = new JButton("Player 2 Roll Dice");

        textArea1 = new JTextArea();
        textArea2 = new JTextArea();
        resultArea = new JTextArea();

        panel.add(rollButton1);
        panel.add(rollButton2);
        panel.add(textArea1);
        panel.add(textArea2);
        panel.add(resultArea);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
*/