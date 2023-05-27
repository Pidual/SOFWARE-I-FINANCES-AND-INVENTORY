package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import org.sqlite.JDBC;

public class Connect {
	
	static String url ="jdbc:sqlite:src/connect/database/database.db";
	static Connection connection;
	
	public static void connect() throws ClassNotFoundException {
	        Connection connection = null;
	        
	        try {
	            Class.forName("org.sqlite.JDBC");
	            String url = "jdbc:sqlite:src/connect/database/database.db";
	            connection = DriverManager.getConnection(url);
	            
	            // Realiza operaciones con la base de datos
	            
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	}

	public static void connect2() {
		try {
			connection = DriverManager.getConnection(url);
			
			if(connection != null) {
			 System.out.println("Conectados");
			}
		}catch( SQLException x) {
			System.out.println(x);
		}
	}
}
