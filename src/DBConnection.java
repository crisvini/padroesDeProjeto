import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/trabalhodb";
    String usuario = "gabriel";
    String senha = "root";

    public DBConnection() {
        try {
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.getMessage();
        }

    }

}
