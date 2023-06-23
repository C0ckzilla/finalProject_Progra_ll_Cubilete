package Final;
import java.sql.*;

public class Database {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/myDatabase";
    private static final String DATABASE_USER = "username";
    private static final String DATABASE_PASSWORD = "password";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
    }

    public void updatePlayerData(String playerName, int newBalance, int newWins) {
        String sql = "UPDATE players SET balance = ?, wins = ? WHERE name = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, newBalance);
            pstmt.setInt(2, newWins);
            pstmt.setString(3, playerName);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getPlayerBalance(String playerName) {
        String sql = "SELECT balance FROM players WHERE name = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, playerName);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("balance");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return -1;
    }

    public int getPlayerWins(String playerName) {
        String sql = "SELECT wins FROM players WHERE name = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, playerName);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("wins");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return -1;
    }
}
