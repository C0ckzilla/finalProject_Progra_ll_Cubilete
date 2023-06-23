package Final;
public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playRound() {
        if (player1.canPlay() && player2.canPlay()) {
            player1.rollDice();
            player2.rollDice();

            System.out.println(player1.getName() + " rolled: " + player1.getHand() + " with value: " + player1.getValue());
            System.out.println(player2.getName() + " rolled: " + player2.getHand() + " with value: " + player2.getValue());

            if (player1.getValue() > player2.getValue()) {
                System.out.println(player1.getName() + " wins!");
                player1.incrementWins();
                player1.addBalance(200);
                player2.subtractBalance(100);
            } else if (player1.getValue() < player2.getValue()) {
                System.out.println(player2.getName() + " wins!");
                player2.incrementWins();
                player2.addBalance(200);
                player1.subtractBalance(100);
            } else {
                System.out.println("It's a tie!");
                player1.addBalance(100);
                player2.addBalance(100);
            }
        }
    }
}
