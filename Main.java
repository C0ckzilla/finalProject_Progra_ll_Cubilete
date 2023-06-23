package Final;
public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 1000); // balance inicial de 1000
        Player player2 = new Player("Player 2", 1000); // balance inicial de 1000

        Game game = new Game(player1, player2);

        for (int i = 0; i < 10; i++) { // jugar 10 rondas
            game.playRound();
        }
    }
}
