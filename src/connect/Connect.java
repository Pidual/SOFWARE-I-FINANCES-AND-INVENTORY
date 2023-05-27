package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.JDBC;

public class Connect {
	
	static String url ="jdbc:sqlite:src/connect/database/database.db";
	static Connection connection;

	public static void connect() {
		try {
			connection = DriverManager.getConnection(url);
			
			if(connection != null) {
			 System.out.println("Conectados");
			}
		}catch( SQLException x) {
			System.out.println(x);
		}
	}
	
	private static bo	olean consult(String query) {
		try {	
    		// Crear un objeto PreparedStatement}
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();    
            // Ejecutar la consulta
         
         return true;
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        return false;
	    }
	}
	
	public static boolean verifyUser(String username, String password) {
		connect();
        // Establecer la conexión con la base de datos
        try  {
            // Crear la consulta SQL con parámetros
            String query = "SELECT * FROM USER WHERE ID_USER = '" +username+ "' AND PASSWORD_USER = '"+password+"'";
            
            // Crear un objeto PreparedStatement
            Statement statement = connection.createStatement();
            
            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery(query);
            
            // Verificar si se obtuvo un resultado
            boolean isValid = resultSet.next();
            
            // Cerrar el ResultSet, el Statement y la conexión
            resultSet.close();
            statement.close();
            
            return isValid;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false; // En caso de error, se asume que los datos no son válidos
    }
	
	public static boolean ExpenseCreation (String category, String description, float value) {
		connect();
		
		String sql = "INSERT INTO EXPENSE (ID_CATEGORY, DESCRIPTION, VALUE) VALUES ('"+category+"','"+
				description+"','"+value+"')";

        return consult(sql);
	}

	
	
}
