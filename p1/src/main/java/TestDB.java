import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/myapp";
        String user = "userhyo";
        String password = "0000";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver loaded successfully!");
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection successful!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}