package models;

public class Ingredient {
    private int id;
    private String name;
    private int quantity;

    public Ingredient(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    
}
