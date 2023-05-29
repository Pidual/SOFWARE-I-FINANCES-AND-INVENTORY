package models;

import java.util.ArrayList;
import java.util.Date;

import connect.Connect;
import models.User;

public class Restaurant {
    private PaymentDesk paymentDesk;

    /**
     * Constructor de la clase Restaurant.
     */
    public Restaurant() {
        paymentDesk = new PaymentDesk();
    }

    /**
     * Valida las credenciales de un usuario.
     * 
     * @param user     Nombre de usuario.
     * @param password Contraseña.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    public boolean login(String user, String password) {
    	return Connect.verifyUser(user, password);
    }

    /**

    Crea un nuevo usuario en la base de datos.
    @param name El nombre del usuario.
    @param user El nombre de usuario del usuario.
    @param password La contraseña del usuario.
    @return true si se crea el usuario correctamente, false en caso contrario.
    */
    public boolean createUser(String name, String user, String password) {
    	return Connect.insertUser(name, user, password);
    }
    
    /**
     * Crea un nuevo pedido utilizando el método createOrder() de la clase PaymentDesk.
     */
    public void createOrder() {
        paymentDesk.createOrder();
    }

    /**
     * Realiza el pago de un gasto creando un nuevo registro en la base de datos y agregándole la
     * fecha actual.
     * 
     * @param category    Categoría del gasto.
     * @param description Descripción del gasto.
     * @param value       Valor del gasto.
     */
    public boolean payExpense(Category category, String description, Float value) {
        return Connect.ExpenseCreation(category.getCategoryName(), description, value, new Date());
    }

    /**
     * Agrega un producto al pedido utilizando el método addProductOrder() de la
     * variable paymentDesk.
     * 
     * @param id       ID del producto a agregar.
     * @param type     Tipo de producto a agregar (1: envasado, 2: cocinado).
     * @param quantity Cantidad del producto a agregar.
     */
    public boolean addProductOrder(int idProduct, int quantity) {
        return paymentDesk.addProductOrder(idProduct, quantity);
    }

    /**
     * Elimina un producto del pedido utilizando el método subtractProductOrder() de
     * la variable paymentDesk.
     * 
     * @param id ID del producto a restar.
     */
    public void subtractProductOrder(int id) {
        paymentDesk.subtractProductOrder(id);
    }

    /**
     * Realiza el pago del pedido utilizando el método payOrder() de la variable
     * paymentDesk.
     */
    public boolean payOrder() {
        return paymentDesk.payOrder();
    }

    /**
     * Agrega un ingrediente al inventario de ingredientes.
     * 
     * ID del ingrediente se genera auto incremental en base de datos.
     * @param name     Nombre del ingrediente.
     * @param quantity Cantidad del ingrediente a agregar.
     */
    public boolean createIngredients( String name, int quantity) {
    	return Connect.createIngrediet(name, quantity);
    }

    /**
     * Crea un nuevo producto en la base de datos con los datos proporcionados.
     *
     * @param typeProduct  el ID del tipo de producto.
     * @param nameProduct  el nombre del producto.
     * @param valueProduct el valor del producto.
     * @param ingredients  la lista de ingredientes asociados al producto.
     * @return true si se crea el producto correctamente, false en caso contrario.
     */
    public boolean createProduct(int typeProduct, String nameProduct, float valueProduct, 
    		ArrayList<Ingredient> ingredients) {
    	return Connect.insertProduct( typeProduct,  nameProduct,  valueProduct, 
        		 ingredients);
    }
    
    /**
     * Resta una cantidad de un ingrediente del inventario de ingredientes.
     * 
     * @param id       ID del ingrediente.
     * @param quantity Cantidad a restar del ingrediente.
     * Se multiplica quantity por -1 para realizar una resta en @meted updateInventoryIngredients()
     */
    public boolean subtractQuantityIngredients(int id, int quantity) {
        return Connect.updateInventoryIngredients(id, -1*quantity);
    }

    /**
     * Agrega una cantidad a un ingrediente del inventario de ingredientes.
     * 
     * @param id       ID del ingrediente.
     * @param quantity Cantidad a agregar al ingrediente.
     */
    public boolean addQuantityIngredients(int id, int quantity) {
    	return Connect.updateInventoryIngredients(id,quantity);
    }
    
    /**
     * Disminuye la cantidad de un producto en el inventario.
     *
     * @param id       el ID del producto.
     * @param quantity la cantidad a disminuir.
     * @return true si la actualización del inventario se realiza correctamente, false en caso contrario.
     */
    public boolean subtractQuantityProduct(int id, int quantity) {
        return Connect.updateInventoryProducts(id, -1*quantity);
    }
    
    /**
     * Aumenta la cantidad de un producto en el inventario.
     *
     * @param id       el ID del producto.
     * @param quantity la cantidad a aumentar.
     * @return true si la actualización del inventario se realiza correctamente, false en caso contrario.
     */
    public boolean addQuantityProduct(int id, int quantity) {
    	return Connect.updateInventoryProducts(id,quantity);
    }

    /**
     * Genera un informe de ventas y cálculo de diferencia entre profit y expenses en
     * un período de tiempo especificado.
     * 
     * @param dateInit Fecha inicial del período.
     * @param dateEnd  Fecha final del período.
     */
    public double totalReport(Date dateInit, Date dateEnd) {
        double profit = Connect.calculateTotalSales(dateInit, dateEnd);
        double expenses = Connect.calculateTotalExpenses(dateInit, dateEnd);
        // Realizar operaciones adicionales según la lógica requerida
        return profit - expenses;
    }

    /**
     * Genera un informe de ventas en un período de tiempo especificado.
     * 
     * @param dateInit Fecha inicial del período.
     * @param dateEnd  Fecha final del período.
     */
    public double salesReport(Date dateInit, Date dateEnd) {
        return Connect.calculateTotalSales(dateInit, dateEnd);
        // Realizar operaciones adicionales según la lógica requerida
    }

    /**
     * Genera un informe de gastos en un período de tiempo especificado.
     * 
     * @param dateInit Fecha inicial del período.
     * @param dateEnd  Fecha final del período.
     */
    public Double costReport(Date dateInit, Date dateEnd) {
        return Connect.calculateTotalExpenses(dateInit, dateEnd);
        // Realizar operaciones adicionales según la lógica requerida
    }

    // Getters y setters

    public Order getOrder() {
        return paymentDesk.getOrder();
    }

    public PaymentDesk getPaymentDesk() {
        return paymentDesk;
    }

    public void setPaymentDesk(PaymentDesk paymentDesk) {
        this.paymentDesk = paymentDesk;
    }

    /**
     * Obtiene el inventario de ingredientes desde la base de datos.
     *
     * @return ArrayList de Ingredientes que representa el inventario de ingredientes.
     */
    public ArrayList<Ingredient> getInventoryIngredients(){
    	return Connect.getInventoryIngredients();
    }
    
    /**
     * Obtiene el inventario de productos desde la base de datos.
     *
     * @return ArrayList de ProductOrder que representa el inventario de productos.
     */
    public ArrayList<ProductOrder> getInventoryProducts(){
    	return Connect.getInventoryProducts();
    }
    
    /**
     * Obtiene una lista de productos que se pueden vender, pero no están inventariados 
     * debido a que algunos son combinaciones de ingredientes.
     *
     * @return ArrayList de Productos que representa los productos disponibles para la venta.
     */
    public ArrayList<Product> getSaleableProducts(){
    	return Connect.getSaleableProducts();
    }
}

