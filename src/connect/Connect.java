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
import models.Product;
import models.ProductOrder;
import models.TypeProduct;

public class Connect {
	
	static String url ="jdbc:sqlite:src/connect/database/database.db";
	static Connection connection;
	static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void connect() {
		try {
			connection = DriverManager.getConnection(url);
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
				description+"','"+value+"','"+dateFormat.format(date)+"')";

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
		// Crear una sentencia SQL para obtener la suma de los valores totales
        String querySumSales = "SELECT SUM(VALUE_PRODUCT_SALES * QUANTITY_PRODUCT_SALES) AS TOTAL_SALES "
                   + " FROM PRODUCTS_SALES "
                   + " JOIN SALES ON PRODUCTS_SALES.ID_SALES = SALES.ID_SALES "
                   + " WHERE DATE_SALES >= '"+dateFormat.format(dateInit)+"' AND DATE_SALES <= '"+dateFormat.format(dateEnd)+"'";

        
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
	
	public static boolean updateInventoryIngredients(int ingredientId, float quantity) {
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
			     int productTypeId =resultSet.getInt("ID_TYPE_PRODUCT");
			     String productName = resultSet.getString("NAME_PRODUCTS");
			     double productValue = resultSet.getDouble("VALUE_PRODUCTS");

			     // Crear el objeto ProductOrder
			     productOrder = new ProductOrder(productId, productTypeId,productName, productValue, 1);
			    
			 }
			
			while (resultSetIngredients.next()) {
                int ingredientId = resultSetIngredients.getInt("ID_INGREDIENTS");
                String ingredientName = resultSetIngredients.getString("NAME_INGREDIENTS");
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

	public static boolean checkInvertoryIngredient(int ingredientId, float quantity) {
        // Construir la consulta 
	   String query = "SELECT * FROM INGREDIENS_INVENTORY WHERE ID_INGREDIENTS = " + ingredientId +
	                       " AND QUANTITY_INGREDIENTS_INVENTORY >= " + quantity;
	      
	   return selectFrom(query);
	}

	
	public static double calculateTotalExpenses(Date dateInit, Date dateEnd) {
		// Crear una sentencia SQL para obtener la suma de los valores totales
        String querySum = "SELECT SUM(VALUE_EXPENSE) AS TOTAL_SALES "
                   + " FROM EXPENSE "
                   + " WHERE DATE_EXPENSE >= '"+dateFormat.format(dateInit)+"' AND DATE_EXPENSE <= '"+dateFormat.format(dateEnd)+"'";

        System.out.println(querySum);
        try (ResultSet resultSet = selectFromObject(querySum)) {
            if (resultSet.next()) {
                return resultSet.getDouble("TOTAL_SALES");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
	} 

	public static boolean insertIntoSales(Date date,int idProduct, double valueProduct, int quantity) {
		String insertSalesQuery = "INSERT INTO SALES (DATE_SALES) VALUES ('"+dateFormat.format(date)+"')";
		
		int keySale = getKeyInsert(insertSalesQuery);
		
		String insertProductsSalesQuery = "INSERT INTO PRODUCTS_SALES (ID_PRODUCTS, ID_SALES, VALUE_PRODUCT_SALES,"
				+ " QUANTITY_PRODUCT_SALES) VALUES ("+idProduct+", "+keySale+", "+valueProduct+", "+quantity+")";
		System.out.println(insertProductsSalesQuery);
		return insertInto(insertProductsSalesQuery);
	}

	
	public static boolean insertUser(String name, String user, String password) {
		String query = "INSERT INTO USER (ID_USER, NAME_USER, PASSWORD_USER) VALUES (' " + user + "', ' " + name +  "', ' " + password +  "')";

		return insertInto(query);
	}

	
	public static boolean insertProduct( int typeProduct, String nameProduct, float valueProduct,
			ArrayList<Ingredient> ingredients) {
		String query = "INSERT INTO PRODUCTS ( ID_TYPE_PRODUCT, NAME_PRODUCTS, VALUE_PRODUCTS) VALUES ("+typeProduct+", '"+nameProduct+"', "+valueProduct+")";
		
		int keyProduct = getKeyInsert(query);
		
		boolean validateInsertIngredients = true;
		
		if(!ingredients.isEmpty()) {
			for (Ingredient ingredient : ingredients) {
	            String insertQuery = "INSERT INTO INGREDIENTS_PRODUCTS (ID_PRODUCTS, ID_INGREDIENTS, QUANTITY_INGREDIENT_PRODUCTS) VALUES ("+keyProduct+", "+ingredient.getId()+", "+ingredient.getQuantity()+")";
	            if(!insertInto(insertQuery)) {
	            	validateInsertIngredients = false;
	            }
			} 
		}	   
		
		return validateInsertIngredients;
	}

	/**
	 * Obtiene el inventario de ingredientes desde la base de datos.
	 * 
	 * @return ArrayList de Ingredientes que representa el inventario de ingredientes.
	 */
	public static ArrayList<Ingredient> getInventoryIngredients() {
		ArrayList<Ingredient> ingredients = new ArrayList<>();
		 // Consultar los ingredientes y su inventario
        String query = "SELECT I.ID_INGREDIENTS, I.NAME_INGREDIENTS, II.QUANTITY_INGREDIENTS_INVENTORY " +
                "FROM INGREDIENTS I " +
                "INNER JOIN INGREDIENS_INVENTORY II ON I.ID_INGREDIENTS = II.ID_INGREDIENTS";
        
        ResultSet resultSet = selectFromObject(query);
        
        try {
			while (resultSet.next()) {
			    int id = resultSet.getInt("ID_INGREDIENTS");
			    String name = resultSet.getString("NAME_INGREDIENTS");
			    float quantity = resultSet.getFloat("QUANTITY_INGREDIENTS_INVENTORY");

			    Ingredient ingredient = new Ingredient(id, name, quantity);
			    ingredients.add(ingredient);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return ingredients;
	}
	
	/**
	 * Obtiene el inventario de productos desde la base de datos.
	 *
	 * @return ArrayList de ProductOrder que representa el inventario de productos.
	 */
	public static ArrayList<ProductOrder> getInventoryProducts() {

		ArrayList<ProductOrder> inventoryProducts = new ArrayList<>();
		// Consultar los productos y su inventario
        String query = "SELECT P.ID_PRODUCTS, P.ID_TYPE_PRODUCT, P.NAME_PRODUCTS, P.VALUE_PRODUCTS, PI.QUANTITY_PRODUCT_INVENTORY " +
                "FROM PRODUCTS P " +
                "INNER JOIN PRODUCT_INVENTORY PI ON P.ID_PRODUCTS = PI.ID_PRODUCTS";
        
        ResultSet resultSet = selectFromObject(query);
        
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("ID_PRODUCTS");
                int typeProductId = resultSet.getInt("ID_TYPE_PRODUCT");
                String name = resultSet.getString("NAME_PRODUCTS");
                double value = resultSet.getDouble("VALUE_PRODUCTS");
                int quantity = resultSet.getInt("QUANTITY_PRODUCT_INVENTORY");

                // Crear el objeto Product
                ProductOrder product = new ProductOrder(id, typeProductId, name, value,quantity);

                // Agregar el producto a la lista
                inventoryProducts.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return inventoryProducts;
	}
	
	/**
	 * Obtiene una lista de productos que se pueden vender, pero no están inventariados 
	 * debido a que algunos son combinaciones de ingredientes.
	 *
	 * @return ArrayList de Productos que representa los productos disponibles para la venta.
	 */
	  public static ArrayList<Product> getSaleableProducts(){
		  ArrayList<Product> saleableProducts = new ArrayList<>();
		  
		// Consultar los productos que se pueden vender
	        String query = "SELECT ID_PRODUCTS, ID_TYPE_PRODUCT, NAME_PRODUCTS, VALUE_PRODUCTS " +
	                "FROM PRODUCTS";
	        
	        ResultSet resultSet = selectFromObject(query);
	        
	        try {
	               
	               while (resultSet.next()) {
	                   int id = resultSet.getInt("ID_PRODUCTS");
	                   int typeProductId = resultSet.getInt("ID_TYPE_PRODUCT");
	                   String name = resultSet.getString("NAME_PRODUCTS");
	                   double value = resultSet.getDouble("VALUE_PRODUCTS");

	                   Product product = new Product(id, typeProductId, name, value);
	                   
	                   if(product.getType() == TypeProduct.COCINADO ) {
	                	   product = getProductOrder(product.getId());
	                   }
	                   saleableProducts.add(product);
	               }
	           } catch (SQLException e) {
	               e.printStackTrace();
	           }
	        
	        return saleableProducts;
	  }
	  
	  public static boolean updateProduct(int productId, int typeProduct, String nameProduct, float valueProduct) {
		// Actualizar los campos de la tabla PRODUCTS
		  String updateProductQuery = "UPDATE PRODUCTS SET ID_TYPE_PRODUCT = " +typeProduct+ ", NAME_PRODUCTS = '" 
				  +nameProduct+ "', VALUE_PRODUCTS = " +valueProduct + " WHERE ID_PRODUCTS = "+ productId;

		return insertInto(updateProductQuery);
	  }
	  
	  public static boolean updateIngredientProduct(Ingredient ingredient, int productId) {
		  String updateIngredientsQuery = "UPDATE INGREDIENTS_PRODUCTS SET QUANTITY_INGREDIENT_PRODUCTS = " 
				  + ingredient.getQuantity() + " WHERE ID_PRODUCTS = " + productId + " AND ID_INGREDIENTS = " + ingredient.getId();
		  
		  return insertInto(updateIngredientsQuery);
	  }
	  
}
