package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.sqlite.JDBC;

import models.ProductOrder;

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
	

	private static boolean insertInto(String query) {
		connect();
		try {	
			PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.executeUpdate();
            return true;

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        return false;
	    }
	}
	
	private static boolean selectFrom(String query) {
		connect();
		 try  {
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
	            return false;
	        }
	}

	private static ResultSet selectFromObject(String query) {
		connect();
		 try  {
	            // Crear un objeto PreparedStatement
	            Statement statement = connection.createStatement();
	            
	            // Ejecutar la consulta
	            ResultSet resultSet = statement.executeQuery(query);
	            
	            return resultSet;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	}
	
	public static boolean verifyUser(String username, String password) {
		
            // Crear la consulta SQL con parámetros
            String query = "SELECT * FROM USER WHERE ID_USER = '" +username+ "' AND PASSWORD_USER = '"+password+"'";
            
            return selectFrom(query);
    }
	

	public static boolean ExpenseCreation (String category, String description, float value, Date date) {
		String sql = "INSERT INTO EXPENSE (ID_CATEGORY, DESCRIPTION_EXPENSE, VALUE_EXPENSE, DATE_EXPENSE) VALUES ('"+category+"','"+
				description+"','"+value+"','"+date+"')";

        return insertInto(sql);
	}
	
	public static boolean checkInvertoryProduct(int productId, int quantity) {
            // Construir la consulta 
       String query = "SELECT * FROM PRODUCT_INVENTORY WHERE ID_PRODUCTS = " + productId +
                           " AND QUANTITY_PRODUCT_INVENTORY >= " + quantity;
            
       return selectFrom(query);
	}   

	public static boolean updateInventoryProducts(int productId, int quantity) {
		String sql = "UPDATE PRODUCT_INVENTORY SET QUANTITY_PRODUCT_INVENTORY = QUANTITY_PRODUCT_INVENTORY + "
				+quantity
				+ " WHERE ID_PRODUCTS =" + productId;
				
		return insertInto(sql);
	}
	
	public static ProductOrder getProductOrder(int id) {
		ProductOrder productOrder = null;
		String sql = "SELECT * FROM PRODUCTS WHERE ID_PRODUCTS ="+id;
		ResultSet resultSet = selectFromObject(sql);
		
		 try {
			 
			if (resultSet.next()) {
				
			     int productId = resultSet.getInt("ID_PRODUCTS");
			     String productName = resultSet.getString("NAME_PRODUCTS");
			     double productValue = resultSet.getDouble("VALUE_PRODUCTS");

			     // Crear el objeto ProductOrder
			     productOrder = new ProductOrder(productId, productName, productValue, 1);
			     
			     resultSet.close();
			     connection.close();
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return productOrder;
	}
	
}
