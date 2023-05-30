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

	/**
	 * Establece una conexión con la base de datos.
	 */
	public static void connect() {
		try {
			connection = DriverManager.getConnection(url);
		}catch( SQLException x) {
			System.out.println(x);
		}
	}
	
	/**
	 * Ejecuta una consulta de inserción en la base de datos.
	 *
	 * @param query la consulta SQL PreparedStatement que permite operaciones como inserciones, update.
	 * @return true si la inserción se realiza correctamente, false en caso contrario.
	 */
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
	
	/**
	 * Ejecuta una consulta de selección en la base de datos y verifica si se obtuvo algún resultado.
	 *
	 * @param query la consulta SQL de selección.
	 * @return true si se obtuvo un resultado, false en caso contrario.
	 */
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

	/**
	 * Ejecuta una consulta de selección en la base de datos y devuelve el objeto ResultSet correspondiente.
	 *
	 * @param query la consulta SQL de selección.
	 * @return el objeto ResultSet que contiene los resultados de la consulta, o null si ocurre un error.
	 */
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
	
	/**
	 * Verifica si existe un usuario con el nombre de usuario y contraseña especificados en la base de datos.
	 *
	 * @param username el nombre de usuario.
	 * @param password la contraseña.
	 * @return true si el usuario existe, false en caso contrario.
	 */
	public static boolean verifyUser(String username, String password) {
		
            // Crear la consulta SQL con parámetros
            String query = "SELECT * FROM USER WHERE ID_USER = '" +username+ "' AND PASSWORD_USER = '"+password+"'";
            
            return selectFrom(query);
    }
	
	/**
	 * Crea un gasto en la base de datos con la categoría, descripción, valor y fecha especificados.
	 *
	 * @param category    la categoría del gasto.
	 * @param description la descripción del gasto.
	 * @param value       el valor del gasto.
	 * @param date        la fecha del gasto.
	 * @return true si el gasto se crea correctamente, false en caso contrario.
	 */
	public static boolean ExpenseCreation (String category, String description, float value, Date date) {
		String sql = "INSERT INTO EXPENSE (ID_CATEGORY, DESCRIPTION_EXPENSE, VALUE_EXPENSE, DATE_EXPENSE) VALUES ('"+category+"','"+
				description+"','"+value+"','"+dateFormat.format(date)+"')";

        return insertInto(sql);
	}
	
	/**
	 * Ejecuta una consulta de inserción en la base de datos y devuelve la clave generada para el registro insertado.
	 *
	 * @param query la consulta SQL de inserción.
	 * @return la clave generada para el registro insertado, o 0 si ocurre un error.
	 */
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
	
	/**
	 * Calcula el total de ventas en un rango de fechas específico.
	 *
	 * @param dateInit la fecha inicial del rango.
	 * @param dateEnd  la fecha final del rango.
	 * @return el total de ventas en el rango de fechas especificado.
	 */
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
	
	/**
	 * Crea un ingrediente en la base de datos con el nombre y cantidad especificados.
	 *
	 * @param name     el nombre del ingrediente.
	 * @param quantity la cantidad del ingrediente.
	 * @return true si el ingrediente se crea correctamente, false en caso contrario.
	 */
	public static boolean createIngrediet(String name, int quantity) {
		connect();
		
		String queryIngredient = "INSERT INTO INGREDIENTS (NAME_INGREDIENTS) VALUES ('" + name + "');";

		int ingredientId = getKeyInsert(queryIngredient); 
	        
	    String queryIngredientInventory = "INSERT INTO INGREDIENS_INVENTORY (ID_INGREDIENTS,"
	        		+ " QUANTITY_INGREDIENTS_INVENTORY) VALUES ("+ingredientId+", "+quantity+")";
	        
	    return insertInto(queryIngredientInventory);
	}
	
	
	/**
	 * Verifica si hay suficiente cantidad de un producto en el inventario.
	 *
	 * @param productId el ID del producto.
	 * @param quantity  la cantidad requerida del producto.
	 * @return true si hay suficiente cantidad en el inventario, false en caso contrario.
	 */
	public static boolean checkInvertoryProduct(int productId, int quantity) {
            // Construir la consulta 
       String query = "SELECT * FROM PRODUCT_INVENTORY WHERE ID_PRODUCTS = " + productId +
                           " AND QUANTITY_PRODUCT_INVENTORY >= " + quantity;
            
       return selectFrom(query);
	}   

	/**
	 * Actualiza la cantidad de un producto en el inventario sumando la cantidad especificada.
	 *
	 * @param productId el ID del producto.
	 * @param quantity  la cantidad a sumar al inventario.
	 * @return true si la actualización se realiza correctamente, false en caso contrario.
	 */
	public static boolean updateInventoryProducts(int productId, int quantity) {
		String sql = "UPDATE PRODUCT_INVENTORY SET QUANTITY_PRODUCT_INVENTORY = QUANTITY_PRODUCT_INVENTORY + "
				+quantity
				+ " WHERE ID_PRODUCTS =" + productId;
				
		return insertInto(sql);
	}
	
	/**
	 * Actualiza la cantidad de un ingrediente en el inventario sumando la cantidad especificada.
	 *
	 * @param ingredientId el ID del ingrediente.
	 * @param quantity     la cantidad a sumar al inventario.
	 * @return true si la actualización se realiza correctamente, false en caso contrario.
	 */
	public static boolean updateInventoryIngredients(int ingredientId, float quantity) {
		String sql = "UPDATE INGREDIENS_INVENTORY SET QUANTITY_INGREDIENTS_INVENTORY = QUANTITY_INGREDIENTS_INVENTORY + "
				+quantity
				+ " WHERE ID_INGREDIENTS =" + ingredientId;
				
		return insertInto(sql);
	}
	
	/**
	 * Obtiene un pedido de producto por su ID.
	 *
	 * @param id el ID del pedido de producto.
	 * @return el objeto ProductOrder correspondiente al ID especificado, o null si no se encuentra.
	 */
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
			    
			 }else {
				 return null;
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

	/**
	 * Verifica si hay suficiente cantidad de un ingrediente en el inventario.
	 *
	 * @param ingredientId el ID del ingrediente.
	 * @param quantity     la cantidad requerida del ingrediente.
	 * @return true si hay suficiente cantidad en el inventario, false en caso contrario.
	 */
	public static boolean checkInvertoryIngredient(int ingredientId, float quantity) {
        // Construir la consulta 
	   String query = "SELECT * FROM INGREDIENS_INVENTORY WHERE ID_INGREDIENTS = " + ingredientId +
	                       " AND QUANTITY_INGREDIENTS_INVENTORY >= " + quantity;
	      
	   return selectFrom(query);
	}

	/**
	 * Calcula el total de gastos en un rango de fechas específico.
	 *
	 * @param dateInit la fecha inicial del rango.
	 * @param dateEnd  la fecha final del rango.
	 * @return el total de gastos en el rango de fechas especificado.
	 */
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

	/**
	 * Inserta una venta en la base de datos.
	 *
	 * @param date         la fecha de la venta.
	 * @param idProduct    el ID del producto vendido.
	 * @param valueProduct el valor del producto vendido.
	 * @param quantity     la cantidad del producto vendido.
	 * @return true si la inserción se realiza correctamente, false en caso contrario.
	 */
	public static boolean insertIntoSales(Date date,int idProduct, double valueProduct, int quantity) {
		String insertSalesQuery = "INSERT INTO SALES (DATE_SALES) VALUES ('"+dateFormat.format(date)+"')";
		
		int keySale = getKeyInsert(insertSalesQuery);
		
		String insertProductsSalesQuery = "INSERT INTO PRODUCTS_SALES (ID_PRODUCTS, ID_SALES, VALUE_PRODUCT_SALES,"
				+ " QUANTITY_PRODUCT_SALES) VALUES ("+idProduct+", "+keySale+", "+valueProduct+", "+quantity+")";
		System.out.println(insertProductsSalesQuery);
		return insertInto(insertProductsSalesQuery);
	}

	/**
	 * Inserta un usuario en la base de datos.
	 *
	 * @param name     el nombre del usuario.
	 * @param user     el nombre de usuario del usuario.
	 * @param password la contraseña del usuario.
	 * @return true si la inserción se realiza correctamente, false en caso contrario.
	 */
	public static boolean insertUser(String name, String user, String password) {
		
		String query;
		
		if(user != null && password != null) {
			query = "INSERT INTO USER (ID_USER, NAME_USER, PASSWORD_USER) VALUES (' " + user + "', ' " 
					+ name +  "', ' " + password +  "')";
		}else {
			return false;
		}
		
		return insertInto(query);
	}

	/**
	 * Inserta un producto en la base de datos.
	 *
	 * @param typeProduct  el ID del tipo de producto.
	 * @param nameProduct  el nombre del producto.
	 * @param valueProduct el valor del producto.
	 * @return true si la inserción se realiza correctamente, false en caso contrario.
	 */
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
	  
	  /**
	   * Actualiza los campos de un producto en la base de datos.
	   *
	   * @param productId    el ID del producto a actualizar.
	   * @param typeProduct  el nuevo ID del tipo de producto uno(1). si es envasado, dos (2) si es cosinado
	   * @param nameProduct  el nuevo nombre del producto.
	   * @param valueProduct el nuevo valor del producto.
	   * @return true si la actualización se realiza correctamente, false en caso contrario.
	   */
	  public static boolean updateProduct(int productId, int typeProduct, String nameProduct, float valueProduct) {
		// Actualizar los campos de la tabla PRODUCTS
		  String updateProductQuery = "UPDATE PRODUCTS SET ID_TYPE_PRODUCT = " +typeProduct+ ", NAME_PRODUCTS = '" 
				  +nameProduct+ "', VALUE_PRODUCTS = " +valueProduct + " WHERE ID_PRODUCTS = "+ productId;

		return insertInto(updateProductQuery);
	  }
	  
	  /**
	   * Actualiza la cantidad de un ingrediente asociado a un producto en la base de datos.
	   *
	   * @param ingredient el objeto Ingredient que representa el ingrediente a actualizar.
	   * @param productId  el ID del producto al que está asociado el ingrediente.
	   * @return true si la actualización se realiza correctamente, false en caso contrario.
	   */
	  public static boolean updateIngredientProduct(Ingredient ingredient, int productId) {
		  String updateIngredientsQuery = "UPDATE INGREDIENTS_PRODUCTS SET QUANTITY_INGREDIENT_PRODUCTS = " 
				  + ingredient.getQuantity() + " WHERE ID_PRODUCTS = " + productId + " AND ID_INGREDIENTS = " + ingredient.getId();
		  
		  return insertInto(updateIngredientsQuery);
	  }
	  
	  /**
	   * Actualiza el nombre de un ingrediente en la tabla "INGREDIENTS".
	   * 
	   * @param ingredientId     ID del ingrediente que se desea modificar.
	   * @param newIngredientName Nuevo nombre del ingrediente.
	   * @return true si la actualización se realiza correctamente, false en caso contrario.
	   */
	  public static boolean updateIngredient(int ingredientId, String newIngredientName) {
	      String updateQuery = "UPDATE INGREDIENTS SET NAME_INGREDIENTS = '" + newIngredientName + "' WHERE ID_INGREDIENTS = " + ingredientId;

	      return insertInto(updateQuery);
	  }
	  
	  /**
	   * Modifica los campos de un usuario en la base de datos.
	   * 
	   * @param userId        ID del usuario que se desea modificar.
	   * @param newName       Nuevo nombre del usuario.
	   * @param newPassword   Nueva contraseña del usuario.
	   * @return true si la modificación se realiza correctamente, false en caso contrario.
	   */
	  public static boolean updateUser(String userId, String newName, String newPassword) {
	      String query = "UPDATE USER SET NAME_USER = '" + newName + "', PASSWORD_USER = '" + newPassword + "' WHERE ID_USER = '" + userId + "'";
	      return insertInto(query);
	  }
	  
	  
	  /**
	   * Este metodo deber ser invocado en cada: Apertura del Programa y Venta de productos
	   * Comprueba si existen filas en la tabla INGREDIENS_INVENTORY con cantidades <= 2000.
	   * @return true si existen filas con QUANTITY_INGREDIENTS_INVENTORY  <= 2000, false en caso contrario.
	   */
	  public static boolean hasRowsWithLowQuantityIngredients() {
		  String query = "SELECT COUNT(*) AS ROW_COUNT FROM INGREDIENS_INVENTORY WHERE "
		  		+ "QUANTITY_INGREDIENTS_INVENTORY <= 2000";
	      
		  ResultSet resultSet = selectFromObject(query);
		  
		  try {
			if (resultSet.next()) {
			      int rowCount = resultSet.getInt("ROW_COUNT");
			      return rowCount > 0;
			  }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		  
		return false;
	  }
	  
	  /**
	   * Este metodo deber ser invocado en cada: Apertura del Programa y Venta de productos
	   * Verifica si existen filas en la tabla "PRODUCT_INVENTORY" con QUANTITY_PRODUCT_INVENTORY <= 10.
	   *
	   * @return true si hay filas con una cantidad baja de inventario, false en caso contrario.
	   */
	  public static boolean hasRowsWithLowInventoryProducts() {
	      // Construir la consulta SQL para contar las filas con QUANTITY_PRODUCT_INVENTORY <= 10
	      String query = "SELECT COUNT(*) AS ROW_COUNT FROM PRODUCT_INVENTORY WHERE "
	      		+ "QUANTITY_PRODUCT_INVENTORY <= 10";

	      // Ejecutar la consulta y obtener el resultado
	      ResultSet resultSet = selectFromObject(query);

	      try {
	          // Verificar si el resultado tiene una siguiente fila
	          if (resultSet.next()) {
	              // Obtener el valor del contador de filas
	              int rowCount = resultSet.getInt("ROW_COUNT");
	              // Retornar true si hay filas con cantidad baja de inventario, false en caso contrario
	              return rowCount > 0;
	          }
	      } catch (SQLException e) {
	          // Manejar cualquier excepción ocurrida durante el procesamiento de la consulta
	          e.printStackTrace();
	      }

	      // Retornar false si no se encontraron filas con cantidad baja de inventario
	      return false;
	  }

	  
	  /**
	     * Recupera una lista de ProductOrder cuyo nombre de producto contiene las palabras clave.
	     * 
	     * @param keyword la palabra clave para la búsqueda
	     * @return una lista de ProductOrder que coinciden con la palabra clave
	     * @throws SQLException si ocurre un error de base de datos
	     */
	    public static ArrayList<ProductOrder> getProductOrdersByKeyword(String keyword){
	    	ArrayList<ProductOrder> productOrders = new ArrayList<>();
	    	
	    	String query = "SELECT P.ID_PRODUCTS, P.ID_TYPE_PRODUCT, P.NAME_PRODUCTS, P.VALUE_PRODUCTS, PI.QUANTITY_PRODUCT_INVENTORY "
                    + "FROM PRODUCTS P "
                    + "JOIN PRODUCT_INVENTORY PI ON P.ID_PRODUCTS = PI.ID_PRODUCTS "
                    + "WHERE P.NAME_PRODUCTS LIKE '%"+ keyword +"%'";
	    	System.out.println(query);
	    	
	    	String queryNoInventary = "SELECT ID_PRODUCTS, ID_TYPE_PRODUCT, NAME_PRODUCTS, VALUE_PRODUCTS\r\n"
	    			+ "FROM PRODUCTS\r\n"
	    			+ "WHERE NAME_PRODUCTS LIKE '%"+ keyword +"%'";
	    	
	    	ResultSet resultSet = selectFromObject(query);
	    	ResultSet resultSetNoInventary = selectFromObject(queryNoInventary);
	    	
	    	// Iterar sobre los resultados y construir objetos ProductOrder
            try {
				while (resultSet.next()) {
				    int id = resultSet.getInt("ID_PRODUCTS");
				    int typeProductId = resultSet.getInt("ID_TYPE_PRODUCT");
				    String name = resultSet.getString("NAME_PRODUCTS");
				    double value = resultSet.getDouble("VALUE_PRODUCTS");
				    int quantity = resultSet.getInt("QUANTITY_PRODUCT_INVENTORY");

				    ProductOrder productOrder = new ProductOrder(id, typeProductId, name, value, quantity);
				    productOrders.add(productOrder);
				}
				
				while (resultSetNoInventary.next()) {
				    int id = resultSetNoInventary.getInt("ID_PRODUCTS");
				    int typeProductId = resultSetNoInventary.getInt("ID_TYPE_PRODUCT");
				    String name = resultSetNoInventary.getString("NAME_PRODUCTS");
				    double value = resultSetNoInventary.getDouble("VALUE_PRODUCTS");

				    ProductOrder productOrder = new ProductOrder(id, typeProductId, name, value, 0);
				    productOrders.add(productOrder);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            return productOrders;
	    }

}
