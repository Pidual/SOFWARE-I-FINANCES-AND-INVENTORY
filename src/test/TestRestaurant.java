package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Category;
import models.Ingredient;
import models.Restaurant;

public class TestRestaurant {
	public static void main(String[] args) {
		// Crear una instancia de la clase Restaurant
        Restaurant restaurant = new Restaurant();

        // Caso de prueba para el método login
        boolean validLogin = restaurant.login("usuario", "contraseña");
        System.out.println("Login válido: " + validLogin);

        // Caso de prueba para el método createUser
        boolean userCreated = restaurant.createUser("John Doe", "johndoe", "password");
        System.out.println("Usuario creado: " + userCreated);

        // Caso de prueba para el método createOrder
        restaurant.createOrder();
        System.out.println("Pedido creado");

        // Caso de prueba para el método payExpense
        boolean expensePaid = restaurant.payExpense(Category.NEWS, "Comida para la cena", 50.0f);
        System.out.println("Gasto pagado: " + expensePaid);

        // Caso de prueba para el método addProductOrder
        boolean productAdded = restaurant.addProductOrder(1, 2);
        System.out.println("Producto agregado al pedido: " + productAdded);

        // Caso de prueba para el método subtractProductOrder
        restaurant.subtractProductOrder(1);
        System.out.println("Producto restado del pedido");

        // Caso de prueba para el método payOrder
        boolean orderPaid = restaurant.payOrder();
        System.out.println("Pedido pagado: " + orderPaid);

        // Caso de prueba para el método createIngredients
        boolean ingredientsCreated = restaurant.createIngredients("Sal", 10);
        System.out.println("Ingredientes creados: " + ingredientsCreated);

        // Crear una lista de ingredientes para el caso de prueba de createProduct
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Sal", 1));
        ingredients.add(new Ingredient("Pimienta", 1));

        // Caso de prueba para el método createProduct
        boolean productCreated = restaurant.createProduct(1, "Producto", 10.0f, (ArrayList<Ingredient>) ingredients);
        System.out.println("Producto creado: " + productCreated);

        // Caso de prueba para el método subtractQuantityIngredients
        boolean quantitySubtracted = restaurant.subtractQuantityIngredients(1, 2);
        System.out.println("Cantidad de ingredientes restada: " + quantitySubtracted);

        // Caso de prueba para el método addQuantityIngredients
        boolean quantityAdded = restaurant.addQuantityIngredients(1, 2);
        System.out.println("Cantidad de ingredientes agregada: " + quantityAdded);

        // Caso de prueba para el método subtractQuantityProduct
        boolean productQuantitySubtracted = restaurant.subtractQuantityProduct(1, 2);
        System.out.println("Cantidad de producto restada: " + productQuantitySubtracted);

        // Caso de prueba para el método addQuantityProduct
        boolean productQuantityAdded = restaurant.addQuantityProduct(1, 2);
        System.out.println("Cantidad de producto agregada: " + productQuantityAdded);

        // Caso de prueba para el método totalReport
        double totalReport = restaurant.totalReport(new Date(), new Date());
        System.out.println("Informe total: " + totalReport);

        // Caso de prueba para el método salesReport
        double salesReport = restaurant.salesReport(new Date(), new Date());
        System.out.println("Informe de ventas: " + salesReport);

        // Caso de prueba para el método costReport
        double costReport = restaurant.costReport(new Date(), new Date());
        System.out.println("Informe de gastos: " + costReport);
	}
}

