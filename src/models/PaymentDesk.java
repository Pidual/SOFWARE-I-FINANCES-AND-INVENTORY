package models;

import java.util.ArrayList;

public class PaymentDesk {
    private Order order;
    private ArrayList<Product> cookedProducts;
    private Inventory<ProductOrder> packagedInventory;
    private Inventory<Ingredient> ingredientInventory;

    /**
     * Constructor de la clase PaymentDesk.
     */
    public PaymentDesk() {
        order = new Order();
        cookedProducts = new ArrayList<>();
        packagedInventory = new Inventory<>();
        ingredientInventory = new Inventory<>();
    }

    /**
     * Crea una nueva instancia del objeto Order y la almacena en la variable order.
     */
    public void createOrder() {
        order = new Order();
    }

    /**
     * Agrega un objeto ProductOrder a la lista products de la variable order.
     * 
     * @param id       ID del producto a agregar.
     * @param type     Tipo de operación (1: agregar desde packagedInventory, 2: agregar desde cookedProducts).
     * @param quantity Cantidad del producto a agregar.
     */
    public void addProductOrder(int id, int type, int quantity) {
        if (type == 1) {
            // Consultar un producto del packagedInventory
            ArrayList<ProductOrder> packagedItems = packagedInventory.getItems();
            for (ProductOrder packagedItem : packagedItems) {
                if (packagedItem.getId() == id && packagedItem.getQuantity() >= quantity) {
                    // Agregar un nuevo ProductOrder a la lista products de la variable order
                    ProductOrder newProductOrder = new ProductOrder(packagedItem.getId(), packagedItem.getName(), 
                    		packagedItem.getValue(),quantity);
                    order.getProducts().add(newProductOrder);
                    break;
                }
            }
        } else if (type == 2) {
            // Buscar un producto en cookedProducts
            for (Product cookedProduct : cookedProducts) {
                if (cookedProduct.getId() == id) {
                    // Verificar la disponibilidad de ingredientes en ingredientInventory
                    boolean ingredientsAvailable = true;
                    for (Ingredient ingredient : cookedProduct.getIngredients()) {
                        ArrayList<Ingredient> ingredientItems = ingredientInventory.getItems();
                        boolean ingredientFound = false;
                        for (Ingredient ingredientItem : ingredientItems) {
                            if (ingredientItem.getId() == ingredient.getId()
                                    && ingredientItem.getQuantity() >= ingredient.getQuantity()) {
                                ingredientFound = true;
                                break;
                            }
                        }
                        if (!ingredientFound) {
                            ingredientsAvailable = false;
                            break;
                        }
                    }
                    if (ingredientsAvailable) {
                        // Agregar un nuevo ProductOrder a la lista products de la variable order
                        ProductOrder newProductOrder = new ProductOrder(cookedProduct.getId(),
                                cookedProduct.getName(), cookedProduct.getValue(), quantity);
                        order.getProducts().add(newProductOrder);
                    }
                    break;
                }
            }
        }
    }

    /**
     * Elimina un objeto ProductOrder de la lista products de la variable order que
     * tenga el ID especificado.
     * 
     * @param id ID del producto a eliminar.
     */
    public void subtractProductOrder(int id) {
        ArrayList<ProductOrder> products = order.getProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }

    /**
     * Realiza el pago de la orden actual y devuelve el objeto Order.
     * 
     * @return Objeto Order correspondiente al pago realizado.
     */
    public Order payOrder() {
        ArrayList<ProductOrder> products = order.getProducts();
        if (products.isEmpty()) {
            return null;
        }

        float totalValue = order.calculateValue();
        boolean isPositive = totalValue >= 0;

        // Realizar operaciones adicionales según la lógica requerida

        return order;
    }

    // Getters y setters

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ArrayList<Product> getCookedProducts() {
        return cookedProducts;
    }

    public void setCookedProducts(ArrayList<Product> cookedProducts) {
        this.cookedProducts = cookedProducts;
    }

    public Inventory<ProductOrder> getPackagedInventory() {
        return packagedInventory;
    }

    public void setPackagedInventory(Inventory<ProductOrder> packagedInventory) {
        this.packagedInventory = packagedInventory;
    }

    public Inventory<Ingredient> getIngredientInventory() {
        return ingredientInventory;
    }

    public void setIngredientInventory(Inventory<Ingredient> ingredientInventory) {
        this.ingredientInventory = ingredientInventory;
    }
}
