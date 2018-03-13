package Metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SingletonConnection {

	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Banque","root","");
		}catch(ClassNotFoundException ex){
			System.out.println("Probleme de pilote base de données");
			System.out.println(ex.getException());
		}catch(SQLException ex){
			System.out.println("Probleme de pilote base de données");
			System.out.println(ex.getMessage());
		}
	}
	public static Connection getConnection() {
		return connection;
	}
}
