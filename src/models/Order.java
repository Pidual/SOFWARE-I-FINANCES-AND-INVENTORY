package models;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int id;
    private Date date;

    private ArrayList<ProductOrder> products;

    public Order(int id, Date date, ArrayList<ProductOrder> products) {
        this.id = id;
        this.date = date;
        this.products = products;
    }

    public Order() {
        // TODO Auto-generated constructor stub
    	this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<ProductOrder> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductOrder> products) {
        this.products = products;
    }

    public Long calculateValue() {
        long totalValue = 0;
        for (ProductOrder productOrder : products) {
            totalValue += productOrder.getQuantity() * productOrder.getValue();
        }
        return totalValue;
    }

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", products=" + products.toString() + "]";
	}
    
    
}

