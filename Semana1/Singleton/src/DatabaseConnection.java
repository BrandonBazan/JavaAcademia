import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	

public class DatabaseConnection {
	private static final DatabaseConnection instancia = new DatabaseConnection();
	private Connection connection;
	private static final String url = "jdbc:mysql://localhost:3306/mydatabase";	
	private static final String username="root";
	private static final String password = "Pa$$w0rd";
	
	private DatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username,password);
		} catch (ClassNotFoundException | SQLException e) {
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
