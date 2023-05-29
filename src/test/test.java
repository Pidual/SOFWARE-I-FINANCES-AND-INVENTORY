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

        ArrayList<Product> saleableProducts = restaurant.getSaleableProducts();
        
     // Imprimir los detalles de cada producto
        for (Product product : saleableProducts) {
            System.out.println(product.toString());
        }

	}
}
