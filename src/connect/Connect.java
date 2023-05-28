package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.sqlite.JDBC;

import models.Ingredient;
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
	
	public static int getKeyInsert(String query) {
		connect();
		int ingredientId = 0;
		ResultSet generatedKeys;
		try {
			
			PreparedStatement ingredientStatement = connection.prepareStatement(query,
	                PreparedStatement.RETURN_GENERATED_KEYS);
			ingredientStatement.executeUpdate();
			
			generatedKeys = ingredientStatement.getGeneratedKeys();
			
	        if (generatedKeys.next()) {
	            ingredientId = generatedKeys.getInt(1);
	        } else {
	            throw new SQLException("Failed to retrieve the generated ID for the ingredient");
	        }
	        
	        generatedKeys.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ingredientId;
	}
	
	public static double calculateTotalSales(Date dateInit, Date dateEnd) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Crear una sentencia SQL para obtener la suma de los valores totales
        String querySumSales = "SELECT SUM(VALUE_PRODUCT_SALES * QUANTITY_PRODUCT_SALES) AS TOTAL_SALES "
                   + " FROM PRODUCTS_SALES "
                   + " JOIN SALES ON PRODUCTS_SALES.ID_SALES = SALES.ID_SALES "
                   + " WHERE DATE_SALES >= '"+dateFormat.format(dateInit)+"' AND DATE_SALES < '"+dateFormat.format(dateEnd)+"'";

        
        try (ResultSet resultSet = selectFromObject(querySumSales)) {
            if (resultSet.next()) {
                return resultSet.getDouble("TOTAL_SALES");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
	}
	
	public static boolean createIngrediet(String name, int quantity) {
		connect();
		
		String queryIngredient = "INSERT INTO INGREDIENTS (NAME_INGREDIENTS) VALUES ('" + name + "');";

		int ingredientId = getKeyInsert(queryIngredient); 
	        
	    String queryIngredientInventory = "INSERT INTO INGREDIENS_INVENTORY (ID_INGREDIENTS,"
	        		+ " QUANTITY_INGREDIENTS_INVENTORY) VALUES ("+ingredientId+", "+quantity+")";
	        
	    return insertInto(queryIngredientInventory);
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
	
	public static boolean updateInventoryIngredients(int ingredientId, int quantity) {
		String sql = "UPDATE INGREDIENS_INVENTORY SET QUANTITY_INGREDIENTS_INVENTORY = QUANTITY_INGREDIENTS_INVENTORY + "
				+quantity
				+ " WHERE ID_INGREDIENTS =" + ingredientId;
				
		return insertInto(sql);
	}
	
	public static ProductOrder getProductOrder(int id) {
		ProductOrder productOrder = null;
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		
		String sql = "SELECT * FROM PRODUCTS WHERE ID_PRODUCTS ="+id;
		String sqlIngredients = "SELECT i.ID_INGREDIENTS, i.NAME_INGREDIENTS, ip.QUANTITY_INGREDIENT_PRODUCTS " +
				"FROM INGREDIENTS i " +
				"JOIN INGREDIENTS_PRODUCTS ip ON i.ID_INGREDIENTS = ip.ID_INGREDIENTS " +
				"WHERE ip.ID_PRODUCTS ="+id;
		
		ResultSet resultSet = selectFromObject(sql);
		ResultSet resultSetIngredients = selectFromObject(sqlIngredients);
		
		 try {
			 
			if (resultSet.next()) {
				
			     int productId = resultSet.getInt("ID_PRODUCTS");
			     String productName = resultSet.getString("NAME_PRODUCTS");
			     double productValue = resultSet.getDouble("VALUE_PRODUCTS");

			     // Crear el objeto ProductOrder
			     productOrder = new ProductOrder(productId, productName, productValue, 1);
			    
			 }
			
			while (resultSetIngredients.next()) {
                int ingredientId = resultSetIngredients.getInt("ID_INGREDIENTS");
                String ingredientName = resultSetIngredients.getString("NAME_INGREDIENS");
                int ingredientQuantity = resultSetIngredients.getInt("QUANTITY_INGREDIENT_PRODUCTS");

                Ingredient ingredient = new Ingredient(ingredientId, ingredientName, ingredientQuantity);
                ingredients.add(ingredient);
            }
			
			productOrder.setIngredients(ingredients);
			
			resultSetIngredients.close();
			resultSet.close();
		    connection.close();
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return productOrder;
	}

	public static boolean checkInvertoryIngredient(int ingredientId, int quantity) {
        // Construir la consulta 
	   String query = "SELECT * FROM INGREDIENS_INVENTORY WHERE ID_INGREDIENTS = " + ingredientId +
	                       " AND QUANTITY_INGREDIENTS_INVENTORY >= " + quantity;
	      
	   return selectFrom(query);
	} 
}
