package models;

import java.util.ArrayList;

import connect.Connect;

public class PaymentDesk {
    private Order order;
    private ArrayList<Product> cookedProducts;
//    private Inventory<ProductOrder> packagedInventory;
//    private Inventory<Ingredient> ingredientInventory;

    /**
     * Constructor de la clase PaymentDesk.
     */
    public PaymentDesk() {
        order = new Order();
        cookedProducts = new ArrayList<>();
//        packagedInventory = new Inventory<>();
//        ingredientInventory = new Inventory<>();
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
     * @param type     Tipo de producto a agregar (1: envasado, 2: cocinado).
     * @param quantity Cantidad del producto a agregar.
     */
    public boolean addProductOrder(int id, int type, int quantity) {
        if (type == 1) {
        	//Si es envasado consulta disponibilidad en inventario de productos
        	if(Connect.checkInvertoryProduct(id,quantity)) {
//        		Connect.updateInventoryProducts(id, -1*quantity);
        		ProductOrder newProductOrder = Connect.getProductOrder(id);
        		newProductOrder.setQuantity(quantity);
        		order.getProducts().add(newProductOrder);
        		return true;
        	}
        } else if (type == 2) {
        	//Si es cosinado consulta la disponibilidad de ingredientes en inventario de ingredientes
        	ProductOrder newProductOrder = Connect.getProductOrder(id);
        	if(newProductOrder != null ) {
        		for (Ingredient ingredient : newProductOrder.getIngredients()) {
                    if (!Connect.checkInvertoryIngredient(ingredient.getId(), ingredient.getQuantity())) {
                        return false;
                    }
                }
        		
        		order.getProducts().add(newProductOrder);
        		return true;
        	}
        }
        return false;
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

}
