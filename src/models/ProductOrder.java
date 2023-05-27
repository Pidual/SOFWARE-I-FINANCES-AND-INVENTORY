package models;

public class ProductOrder extends Product {
	
	private int quantity;
	private TypeProduct type;
    

	public ProductOrder(int id, String name, double value, int quantity2) {
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
    
    public double getValue() {
        return super.getValue();
    }
    
	@Override
	public String toString() {
		return "ProductOrder [quantity=" + quantity + " " +super.toString() + "]";
	}
    
    
}

