import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseDemo {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change 'testdb' to your DB name
        String user = "root"; // Default XAMPP username
        String password = ""; // Default XAMPP password (empty)

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");

            // SQL Query
            String sql = "SELECT * FROM databasedemo";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            // Print results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email"));
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}