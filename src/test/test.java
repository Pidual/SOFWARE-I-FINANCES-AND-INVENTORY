package test;
//import org.sqlite.JDBC;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import connect.Connect;
import models.Category;
import models.Ingredient;
import models.Product;
import models.ProductOrder;
import models.Restaurant;
import models.TypeProduct;

public class test {
	public static void main(String[] args) throws ClassNotFoundException {
        // Crear una instancia de la clase Restaurant
        Restaurant restaurant = new Restaurant();
        
        int productId = 12;
        int typeProduct = 2;
        String nameProduct = "Hamburguesa pequeña";
        float valueProduct = 5000;

        // Act
        boolean result = Connect.updateProduct(productId, typeProduct, nameProduct, valueProduct);


        // Assert
        System.out.println(result);

	}
}
