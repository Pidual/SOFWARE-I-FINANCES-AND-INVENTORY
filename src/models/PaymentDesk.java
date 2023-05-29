package models;

import java.util.ArrayList;
import java.util.Date;

import connect.Connect;

public class PaymentDesk {
    private Order order;
    private ArrayList<Product> cookedProducts;

    /**
     * Constructor de la clase PaymentDesk.
     */
    public PaymentDesk() {
        order = new Order();
        cookedProducts = new ArrayList<>();
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
     * @param quantity Cantidad del producto a agregar.
     */
    public boolean addProductOrder(int id, int quantity) {
    	ProductOrder newProductOrder = Connect.getProductOrder(id);
    	
    	if (newProductOrder != null) {
    	    newProductOrder.setQuantity(quantity);
    	} else {
    	    return false;
    	}
    	
        if (newProductOrder.getType() == TypeProduct.ENVASADO) {
        	//Si es envasado consulta disponibilidad en inventario de productos
        	if(Connect.checkInvertoryProduct(id,quantity)) {
        		order.getProducts().add(newProductOrder);
        		return true;
        	}
        } else if (newProductOrder.getType() == TypeProduct.COCINADO) {
        	//Si es cosinado consulta la disponibilidad de ingredientes en inventario de ingredientes
        		for (Ingredient ingredient : newProductOrder.getIngredients()) {
        			if (!Connect.checkInvertoryIngredient(ingredient.getId(), ingredient.getQuantity()*quantity )) {
                    	return false;
                    }
                }
        		
        		order.getProducts().add(newProductOrder);
        		return true;
        }
        return false;
    }

    /**
     * Elimina un ProductOrder de la lista products de la variable order que
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
    public boolean payOrder() {
        ArrayList<ProductOrder> products = order.getProducts();
        if (products.isEmpty()) {
            return false;
        }else {
        	for (ProductOrder product : products) {
        	    // Accede a los atributos del objeto ProductOrder
        	    int id = product.getId();
        	    String name = product.getName();
        	    double value = product.getValue();
        	    int quantity = product.getQuantity();
        	    
        	    if(product.getType()== TypeProduct.ENVASADO) {
            		Connect.updateInventoryProducts(id, -1*quantity);
        	    }
        	    if(product.getType()== TypeProduct.COCINADO) {
        	    	for (Ingredient ingredient : product.getIngredients()) {
            			Connect.updateInventoryIngredients(ingredient.getId(), -1* (ingredient.getQuantity()*quantity) );
                    }
        	    }
        	    order = new Order();
        	    return Connect.insertIntoSales(new Date(), id, value, quantity);
        	}
        }
        return false;
    }

    /**
     * Disminuye en 1 la cantidad de un ProductOrder en la lista de productos de la orden.
     *
     * @param id ID del producto cuya cantidad se va a disminuir.
     */
    public void decreaseProductQuantity(int id) {
        ArrayList<ProductOrder> products = order.getProducts();

        // Iterar sobre cada ProductOrder en la lista de productos
        for (ProductOrder product : products) {
            if (product.getId() == id) {
                int quantity = product.getQuantity();

                // Verificar que la cantidad sea mayor que cero antes de disminuir
                if (quantity > 0) {
                    product.setQuantity(quantity - 1);  // Disminuir la cantidad en 1
                }
                
                break;  // Romper el bucle ya que se ha encontrado el producto correspondiente
            }
        }
    }

    /**
     * Aumenta en 1 la cantidad de un ProductOrder en la lista de productos de la orden.
     *
     * @param id ID del producto cuya cantidad se va a aumentar.
     */
    public void increaseProductQuantity(int id) {
        ArrayList<ProductOrder> products = order.getProducts();

        // Iterar sobre cada ProductOrder en la lista de productos
        for (ProductOrder product : products) {
            if (product.getId() == id) {
                int quantity = product.getQuantity();
                product.setQuantity(quantity + 1);  // Aumentar la cantidad en 1
                break;  // Romper el bucle ya que se ha encontrado el producto correspondiente
            }
        }
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
