package Final;
public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.rollDice();
        player2.rollDice();

        System.out.println(player1.getName() + " rolled: " + player1.getHand());
        System.out.println(player2.getName() + " rolled: " + player2.getHand());

        if (player1.getHand().compareTo(player2.getHand()) > 0) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getHand().compareTo(player2.getHand()) < 0) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

