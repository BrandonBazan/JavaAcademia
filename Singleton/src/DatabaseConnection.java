import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	

public class DatabaseConnection {
	private static final DatabaseConnection instancia = new DatabaseConnection();
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/mydatabase";	
	private String username="root";
	private String password = "password";
	
	private DatabaseConnection() {
		try {
			connection = DriverManager.getConnection(url, username,password);
		} catch (SQLException e) {
			e.printStackTrace();
				
			throw new RuntimeException("Error al conectar a la base de datos", e);
		}
		
	}
	
	public static DatabaseConnection getInstancia() {
			return instancia;
		}
	
	public Connection getConnection() {
        return connection;
    }
	
}
