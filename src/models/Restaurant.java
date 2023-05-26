package models;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    private Order order;
    private PaymentDesk paymentDesk;
    private ArrayList<Product> products;
    private ArrayList<User> users;
    private Inventory<Ingredient> ingredientInventory;
    private Inventory<Product> packagedInventory;

    /**
     * Constructor de la clase Restaurant.
     */
    public Restaurant() {
        order = new Order();
        paymentDesk = new PaymentDesk();
        products = new ArrayList<>();
        users = new ArrayList<>();
        ingredientInventory = new Inventory<>();
        packagedInventory = new Inventory<>();
    }

    /**
     * Valida las credenciales de un usuario.
     * 
     * @param user     Nombre de usuario.
     * @param password Contraseña.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    public boolean login(String user, String password) {
        for (User u : users) {
            if (u.getUser().equals(user) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Crea un nuevo pedido utilizando el método createOrder() de la clase PaymentDesk.
     */
    public void createOrder() {
        paymentDesk.createOrder();
    }

    /**
     * Realiza el pago de un gasto creando un nuevo objeto Expense y agregándole la
     * fecha actual.
     * 
     * @param category    Categoría del gasto.
     * @param description Descripción del gasto.
     * @param value       Valor del gasto.
     */
    public void payExpense(Category category, String description, Long value) {
        Expense expense = new Expense(category, description, value);
        expense.setDate(new Date());
        // Realizar operaciones adicionales según la lógica requerida
    }

    /**
     * Agrega un producto al pedido utilizando el método addProductOrder() de la
     * variable paymentDesk.
     * 
     * @param id       ID del producto a agregar.
     * @param type     Tipo de operación (1: agregar desde packagedInventory, 2:
     *                 agregar desde cookedProducts).
     * @param quantity Cantidad del producto a agregar.
     */
    public void addProductOrder(int id, int type, int quantity) {
        paymentDesk.addProductOrder(id, type, quantity);
    }

    /**
     * Resta un producto del pedido utilizando el método subtractProductOrder() de
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
    public void payOrder() {
        paymentDesk.payOrder();
    }

    /**
     * Agrega un ingrediente al inventario de ingredientes.
     * 
     * @param id       ID del ingrediente a agregar.
     * @param name     Nombre del ingrediente.
     * @param quantity Cantidad del ingrediente a agregar.
     */
    public void createIngredients(int id, String name, int quantity) {
        Ingredient ingredient = new Ingredient(id, name, quantity);
        ingredientInventory.createItem(ingredient);
    }

    /**
     * Resta una cantidad de un ingrediente del inventario de ingredientes.
     * 
     * @param id       ID del ingrediente.
     * @param quantity Cantidad a restar del ingrediente.
     */
    public void subtractQuantityIngredients(int id, int quantity) {
        ingredientInventory.subtractQuantity(id, quantity);
    }

    /**
     * Agrega una cantidad a un ingrediente del inventario de ingredientes.
     * 
     * @param id       ID del ingrediente.
     * @param quantity Cantidad a agregar al ingrediente.
     */
    public void addQuantityIngredients(int id, int quantity) {
        ingredientInventory.addQuantity(id, quantity);
    }

    /**
     * Genera un informe de ventas y cálculo de diferencia entre profit y expenses en
     * un período de tiempo especificado.
     * 
     * @param dateInit Fecha inicial del período.
     * @param dateEnd  Fecha final del período.
     */
    public void totalReport(Date dateInit, Date dateEnd) {
        Report report = new Report(dateInit, dateEnd);
        float difference = report.calculateDifference();
        // Realizar operaciones adicionales según la lógica requerida
    }

    /**
     * Genera un informe de ventas en un período de tiempo especificado.
     * 
     * @param dateInit Fecha inicial del período.
     * @param dateEnd  Fecha final del período.
     */
    public Long salesReport(Date dateInit, Date dateEnd) {
        Report report = new Report(dateInit, dateEnd);
        return report.getProfit();
        // Realizar operaciones adicionales según la lógica requerida
    }

    /**
     * Genera un informe de gastos en un período de tiempo especificado.
     * 
     * @param dateInit Fecha inicial del período.
     * @param dateEnd  Fecha final del período.
     */
    public Long costReport(Date dateInit, Date dateEnd) {
        Report report = new Report(dateInit, dateEnd);
        return report.getExpenses();
        // Realizar operaciones adicionales según la lógica requerida
    }

    // Getters y setters

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentDesk getPaymentDesk() {
        return paymentDesk;
    }

    public void setPaymentDesk(PaymentDesk paymentDesk) {
        this.paymentDesk = paymentDesk;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public Inventory<Ingredient> getIngredientInventory() {
        return ingredientInventory;
    }

    public void setIngredientInventory(Inventory<Ingredient> ingredientInventory) {
        this.ingredientInventory = ingredientInventory;
    }

    public Inventory<Product> getPackagedInventory() {
        return packagedInventory;
    }

    public void setPackagedInventory(Inventory<Product> packagedInventory) {
        this.packagedInventory = packagedInventory;
    }
}

