package Final;
public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.rollDice();
        player1.displayHand();

        player2.rollDice();
        player2.displayHand();

        System.out.println(player1.getName() + " rolled: " + player1.getHand() + " with value: " + player1.getValue());
        System.out.println(player2.getName() + " rolled: " + player2.getHand() + " with value: " + player2.getValue());

        if (player1.getValue() > player2.getValue()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getValue() < player2.getValue()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

