package test;

import models.Restaurant;

public class TestAlFallo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
		
		System.out.println("Caso de Prueba: Credenciales inválidas");
		System.out.println("Resultado esperado: false");
		System.out.println("Resultado obtenido: " + restaurant.login("usuario123", "contraseña456"));

		System.out.println("Caso de Prueba: Creación de usuario con datos incorrectos");
		System.out.println("Resultado esperado: false");
		System.out.println("Resultado obtenido: " + restaurant.createUser("", "", ""));

		System.out.println("Caso de Prueba: Agregar producto al pedido con ID inválido");
		System.out.println("Resultado esperado: false");
		System.out.println("Resultado obtenido: " + restaurant.addProductOrder(-1, 1));

		System.out.println("Caso de Prueba: Restar producto del pedido con ID inválido");
		System.out.println("No se produce ninguna excepción");
		restaurant.subtractProductOrder(-1);

		
		System.out.println("Caso de Prueba: Pago del pedido sin productos");
		System.out.println("Resultado esperado: false");
		System.out.println("Resultado obtenido: " + restaurant.payOrder());

		System.out.println("Hay bajos niveles de inventario " + restaurant.AlertLowQuatity() );
		
	}

}
