package models;

public class ProductOrder extends Product {
	
	private int quantity;
	
    

	public ProductOrder(int id, String name, Long value, int quantity2) {
		// TODO Auto-generated constructor stub
		super(id,name,value);
		this.quantity = quantity2;
	}

	public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Long getValue() {
        return super.getValue();
    }
}

