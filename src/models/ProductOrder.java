
package models;
public class ProductOrder extends Product{


    private int quantity;

    public ProductOrder(int quantity){
        this.quantity = 0;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
