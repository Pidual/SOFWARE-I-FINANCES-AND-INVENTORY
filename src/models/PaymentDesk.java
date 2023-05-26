package models;

import java.util.ArrayList;

public class PaymentDesk {
    private Order order;
    private ArrayList<Product> cookedProducts;
    private Inventory<Product> packagedInventory;
    private Inventory<Ingredient> ingredientInventory;

    public PaymentDesk() {
        order = new Order();
        cookedProducts = new ArrayList<>();
        packagedInventory = new Inventory<>();
        ingredientInventory = new Inventory<>();
    }

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

    public Inventory<Product> getPackagedInventory() {
        return packagedInventory;
    }

    public void setPackagedInventory(Inventory<Product> packagedInventory) {
        this.packagedInventory = packagedInventory;
    }

    public Inventory<Ingredient> getIngredientInventory() {
        return ingredientInventory;
    }

    public void setIngredientInventory(Inventory<Ingredient> ingredientInventory) {
        this.ingredientInventory = ingredientInventory;
    }

    public void createOrder() {
        order = new Order();
    }

    public void addProductOrder(int id, int type) {
        Product product = new Product(id, type);
        order.getProducts().add(product);
    }

    public void subtractProductOrder(int id) {
        for (Product product : order.getProducts()) {
            if (product.getId() == id) {
                order.getProducts().remove(product);
                break;
            }
        }
    }

    public Order payOrder() {
        return order;
    }
}
