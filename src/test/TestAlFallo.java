package test;

import models.Category;
import models.Restaurant;

public class TestAlFallo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
		
		System.out.println("Caso de Prueba: Realizar el pago de un gasto correctamente");
		System.out.println("Resultado esperado: true");
		System.out.println("Resultado obtenido: " + restaurant.payExpense(Category.NOVEDADES, "Compra de ingredientes", 100.0f));
		
		System.out.println("Caso de Prueba: Categoría de gasto nula");
		System.out.println("Resultado esperado: false");
		System.out.println("Resultado obtenido: " + restaurant.payExpense(null, "Compra de utensilios", 50.0f));

		System.out.println("Caso de Prueba: Descripción vacía");
		System.out.println("Resultado esperado: true");
		System.out.println("Resultado obtenido: " + restaurant.payExpense(Category.SERVICIOS_PUBLICOS, "", 75.0f));
		
		System.out.println("Caso de Prueba: Valor negativo");
		System.out.println("Resultado esperado: false");
		System.out.println("Resultado obtenido: " + restaurant.payExpense(Category.SERVICIOS_PUBLICOS, "Pago de electricidad", -200.0f));

		System.out.println("Caso de Prueba: Valor cero");
		System.out.println("Resultado esperado: false");
		System.out.println("Resultado obtenido: " + restaurant.payExpense(Category.NOVEDADES, "Combustible", 0.0f));

		


	}

}
