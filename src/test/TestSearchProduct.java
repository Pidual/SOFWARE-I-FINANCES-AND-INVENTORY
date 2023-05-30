package test;

import java.util.ArrayList;

import connect.Connect;
import models.ProductOrder;

public class TestSearchProduct {
	public static void main(String[] args) {
		System.out.println("Caso de Prueba: Palabra clave válida con resultados");
		System.out.println("Palabra clave: 'producto'");
		ArrayList<ProductOrder> productOrders = Connect.getProductOrdersByKeyword("producto");
		for (ProductOrder productOrder : productOrders) {
		    System.out.println(productOrder);
		}
		
		System.out.println("Caso de Prueba: Palabra clave válida sin resultados");
		System.out.println("Palabra clave: 'inexistente'");
		productOrders = Connect.getProductOrdersByKeyword("inexistente");
		if (productOrders.isEmpty()) {
		    System.out.println("No se encontraron resultados.");
		} else {
		    System.out.println("Resultados inesperados encontrados.");
		}

		System.out.println("Caso de Prueba: Palabra clave nula");
		System.out.println("Palabra clave: null");
		productOrders = Connect.getProductOrdersByKeyword(null);
		if (productOrders.isEmpty()) {
		    System.out.println("No se encontraron resultados.");
		} else {
		    System.out.println("Resultados inesperados encontrados.");
		}

		System.out.println("Caso de Prueba: Palabra clave vacía");
		System.out.println("Palabra clave: ''");
		productOrders = Connect.getProductOrdersByKeyword("");
		if (productOrders.isEmpty()) {
		    System.out.println("No se encontraron resultados.");
		} else {
		    System.out.println("Resultados inesperados encontrados.");
		}

		System.out.println("Caso de Prueba: Palabra clave vacía");
		System.out.println("Palabra clave: 'Cerv'");
		productOrders = Connect.getProductOrdersByKeyword("Cerveza");
		if (productOrders.isEmpty()) {
		    System.out.println("No se encontraron resultados.");
		} else {
		    System.out.println("Resultados inesperados encontrados." +productOrders.toString() );
		}
		
	}
}
